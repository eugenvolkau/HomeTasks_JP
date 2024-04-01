package com.telran.prof.hometask.ht18032024.hospice;

import java.util.Comparator;
class ComparatorPatient implements Comparator<Patient>{

    public int compare(Patient o1, Patient o2){

        return o1.getCondition() - o2.getCondition();
    }
}
