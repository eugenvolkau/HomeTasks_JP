package com.telran.prof.hometask.stream_ht_10042024.AlternatOldAbon;

import java.util.Comparator;

public  class AlternateAgeComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getAge()- o2.getAge();
    }
}
