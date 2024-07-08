package com.telran.prof.hometask.EventProcessArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriterOfEvent extends Thread {

    private List<List<String>> list;

    public WriterOfEvent(List<List<String>> list) {
        this.list = list;
    }

    @Override
    public void run() {
        sleepNow(1);
        while (true) {

            synchronized (list) {

                if (list.size() > 0) {
                    List<String> s = list.get(0);

                    System.out.println("incomen list  " + list + " -> " + EventCreator.eventCounter);
                    Iterator<String> itera = s.iterator();
                    List<String> list1 = new ArrayList<>();
                    while (itera.hasNext()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Handler ").append(Thread.currentThread().getName() + "   id=").append(EventCreator.eventCounter + " - ").append(itera.next());

                        list1.add(sb.toString());
                    }
                    list1.stream().forEach(String -> System.out.println(String));

                    list.remove(0);
                } else {
                    System.out.println("  ------>");

                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}