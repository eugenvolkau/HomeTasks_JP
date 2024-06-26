package com.telran.prof.hometask.eventProcessing29052024;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class EventCreator {

   // public static AtomicInteger  ventUser = new AtomicInteger();
    public int userID;
    public String userData;
    List<String> userDataThread = new ArrayList<>();


    public EventCreator() {
    return;}

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, List<String>> unitEvent = new ConcurrentHashMap<>();

            Thread threadInn = new Thread(new Event(unitEvent));
//            Thread threadInn1 = new Thread(new Event(unitEvent));
//            Thread threadInn2 = new Thread(new Event(unitEvent));
//            Thread threadInn3 = new Thread(new Event(unitEvent));
//            Thread threadInn4 = new Thread(new Event(unitEvent));
//            Thread threadInn5 = new Thread(new Event(unitEvent));
//            Thread threadInn6 = new Thread(new Event(unitEvent));
//            Thread threadInn7 = new Thread(new Event(unitEvent));
//            Thread threadInn8 = new Thread(new Event(unitEvent));
//            Thread threadInn9 = new Thread(new Event(unitEvent));

        Thread threadOut1 = new Thread(new FirewallEventListener(unitEvent));
        Thread threadOut2 = new Thread(new FirewallEventListener(unitEvent));
        Thread threadOut3= new Thread(new FirewallEventListener(unitEvent));
        Thread threadOut4 = new Thread(new FirewallEventListener(unitEvent));


        threadInn.start();
//        threadInn1.start();
//        threadInn2.start();
//        threadInn3.start();
//        threadInn4.start();
//        threadInn5.start();
//        threadInn6.start();
//        threadInn7.start();
//        threadInn8.start();
//        threadInn9.start();

       // threadInn2.start();

        Thread.sleep(3000);

        threadOut1.start();
        threadOut2.start();
        threadOut3.start();
        threadOut4.start();


//
        threadInn.join();
//        threadInn1.join();
//        threadInn2.join();
//        threadInn3.join();
//        threadInn4.join();
//        threadInn5.join();
//        threadInn6.join();
//        threadInn7.join();
//        threadInn8.join();
//        threadInn9.join();


        threadOut1.join();
        threadOut2.join();
        threadOut3.join();
        threadOut4.join();

//        unitEvent.forEach((k, v) -> System.out.println("ID " + k + " " +
//                "list " + v));
         }
}
