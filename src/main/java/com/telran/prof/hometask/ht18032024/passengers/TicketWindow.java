package com.telran.prof.hometask.ht18032024.passengers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TicketWindow {

    public static void main(String[] args) {

        List<Passenger> psg = Arrays.asList(
                new Passenger(2, "Smith"),
                new Passenger(3, "Korleone"),
                new Passenger(1, "Reserford"),
                new Passenger(2, "Merkel"),
                new Passenger(3, "Sholz"),
                new Passenger(1, "Chaplin"),
                new Passenger(2, "Cherchill"),
                new Passenger(3, "Shiklgruber"),
                new Passenger(3, "Stallone"),
                new Passenger(2, "Shiffer"),
                new Passenger(3, "Gogenzollern"),
                new Passenger(1, "Oppengeymer")
        );
        PriorityQueue<Passenger> passClassQueue = new PriorityQueue<>(new PassClassComparator());

        for (Passenger currpass : psg) {
           passClassQueue.add(currpass);
        }
int i = 1;
        while (!passClassQueue.isEmpty()){
        System.out.println("priority of discussion");
        System.out.println(i+ "number" + passClassQueue.poll());
        i++;}
            }
}
