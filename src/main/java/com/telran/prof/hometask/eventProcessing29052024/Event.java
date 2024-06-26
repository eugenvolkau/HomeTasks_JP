package com.telran.prof.hometask.eventProcessing29052024;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@AllArgsConstructor
@ToString
public class Event implements Runnable {

    private int eventId;
    private String userName;
    private String userIp;
    private LocalDate eventDate;
    private EventState eventState;
    public static ConcurrentHashMap<Integer, List<String>> unitEvent;

    public Event(ConcurrentHashMap<Integer, List<String>> unitEvent) {
        this.unitEvent = unitEvent;
    }

    @Override
    public void run() {
//        EventCreator eventCreator = new EventCreator();


//        unitEvent.put(1,list);
        HashMap<String, String> usersNameIP = new HashMap<>();
        usersNameIP.put("190.30.105.60", "Karlson");
        usersNameIP.put("190.31.105.61", "Pinockio");
        usersNameIP.put("190.31.105.62", "Shweik");
        usersNameIP.put("190.31.105.63", "Jerry");
        usersNameIP.put("190.31.105.64", "Rocky");
        usersNameIP.put("190.31.105.65", "Terminator");
        usersNameIP.put("190.31.105.66", "Korleone");
        usersNameIP.put("190.31.105.67", "Cleopatra");
        usersNameIP.put("190.31.105.68", "Munchausen");
        usersNameIP.put("190.31.105.69", "The Snow Queen");


//EventState eventState = new EventState();

        for (int i = 0; i < 100; i++) {
            List<String> list = new ArrayList<>();
            //EventCreator.ventUser.getAndIncrement();
            int eventId = i;

            String userIP = String.valueOf(usersNameIP.keySet()
                    .toArray()[new Random().nextInt(usersNameIP
                    .keySet().toArray().length)]);


            Optional<String> userName = usersNameIP.entrySet().stream()
                    .filter(k -> userIP.equals(k.getKey()))
                    .map(HashMap.Entry::getValue)
                    .findFirst();
            list.add(userName.get());
            list.add(userIP);
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            list.add(localDateTime.toString());

            String status = String.valueOf(EventState.randomDirection());
            list.add(status);

            unitEvent.put(eventId, list);
            sleep(1000);
        }
//        unitEvent.forEach((k, v) -> System.out.println("ID " + k + " " +
//                "list " + v));
    }

    private void sleep(int i) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


