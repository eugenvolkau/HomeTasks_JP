package com.telran.prof.hometask.eventProcessing29052024;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FirewallEventListener implements Runnable {

    private ConcurrentHashMap<Integer, List<String>> unitEvent;

    public FirewallEventListener(ConcurrentHashMap<Integer, List<String>> unitEvent) {
        this.unitEvent = unitEvent;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            if (unitEvent.size() > 0) {
                Integer lastKey = unitEvent.entrySet().stream()
                        .min(Comparator.comparingInt(entry -> entry.getKey()))
                        .get().getKey();
                ArrayList list = (ArrayList) unitEvent.get(lastKey);
                unitEvent.remove(lastKey);

                Iterator<String> itera = list.iterator();
                List<String> list1 = new ArrayList<>();
                while (itera.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Handler ").append(Thread.currentThread().getName() + "   id=").append(lastKey + "  ").append(itera.next());

                    list1.add(sb.toString());
                }
                list1.stream()
                        .forEach(String -> System.out.println(String));

            } else {
                System.out.println("Check list. List is Emty");
                try {
                    unitEvent.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
