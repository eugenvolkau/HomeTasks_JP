//package com.telran.prof.hometask.eventProcessing29052024;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.ToString;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
//@Getter
//@AllArgsConstructor
//@ToString
//public class Event implements Runnable {
//
//    private int eventId;
//    private String userName;
//    private String userIp;
//    private LocalDate eventDate;
//    private EventState eventState;
//    public Map<Integer, List> unitEvent;
//
//    public Event(Map<Integer, List<String>> unitEvent) {
//    }
//
//
//
//    @Override
//    public void run() {
////        EventCreator eventCreator = new EventCreator();
//
//        List<String> list = Arrays.asList("a","a","a","a");
//        unitEvent.put(1,list);
//        HashMap<String, String> usersNameIP = new HashMap<>();
//        usersNameIP.put("190.30.105.60", "KimJongUn");
//        usersNameIP.put("190.31.105.61", "Bacassa");
//        usersNameIP.put("190.31.105.62", "Lukashenka");
//        usersNameIP.put("190.31.105.63", "Putin");
//        usersNameIP.put("190.31.105.64", "Shiklgruber");
//        usersNameIP.put("190.31.105.65", "Asad");
//        usersNameIP.put("190.31.105.66", "Djugashvili");
//        usersNameIP.put("190.31.105.67", "Mussolini");
//        usersNameIP.put("190.31.105.68", "Tchaushesku");
//        usersNameIP.put("190.31.105.69", "MaoDseDun");
//
//
//
//            String randomUserIP = String.valueOf(usersNameIP.keySet().toArray()[new Random()
//                    .nextInt(usersNameIP.keySet().toArray().length)]);
//            Optional randomUserName = usersNameIP.entrySet().stream()
//                    .filter(k->randomUserIP.equals(k.getKey()))
//                    .map(HashMap.Entry::getValue)
//                            .findFirst();
//
//                    LocalDateTime localDateTime = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy" +
//                    "-MM-dd HH:mm:ss");
//
//            String username = String.valueOf(randomUserName);
//
//            String formatTime = localDateTime.format(formatter);
//
//            String status = String.valueOf(EventState.randomDirection());
//
//            int indexLast = unitEvent.keySet().
//
//       // System.out.println(randomUserName.get() + " " + randomUserIP + " "
//        // + formatTime + " " + EventState.randomDirection().toString() + " " + indexLast);
//      list = Arrays.asList(username, randomUserIP, formatTime,
//                status);
//
//unitEvent.put(indexLast,list);
//
//    }
//        private void sleep() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//}

