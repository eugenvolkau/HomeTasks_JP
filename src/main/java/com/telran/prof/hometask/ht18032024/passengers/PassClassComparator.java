package com.telran.prof.hometask.ht18032024.passengers;

import java.util.Comparator;

public class PassClassComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o1.getClassOfService() - o2.getClassOfService();
    }
}