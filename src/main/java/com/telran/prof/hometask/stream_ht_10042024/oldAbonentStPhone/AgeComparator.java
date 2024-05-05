package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import java.util.Comparator;

public class AgeComparator implements Comparator<Abonents>{

    @Override
    public int compare(Abonents o1, Abonents o2) {
        return o1.getAge()- o2.getAge();
    }
}
