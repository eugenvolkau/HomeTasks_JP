//package com.telran.prof.hometask.eventProcessing29052024;
//
//import java.security.Key;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class EventCreator {
//
//    public static AtomicInteger  ventUser = new AtomicInteger();
//    public int userID;
//    public String userData;
//    List<String> userDataThread = new ArrayList<>();
//
//    public EventCreator() {
//    return;}
//
//    public static void main(String[] args) {
//
//        Map<Integer, List<String>> unitEvent = new HashMap<>();
//
//        Event event = new Event(unitEvent);
//Thread thread = new Thread(event);
//        thread.start();
//
//      unitEvent.entrySet().stream()
//              .forEach(listEntry -> System.out.println(listEntry) );
//
//         }
//}
