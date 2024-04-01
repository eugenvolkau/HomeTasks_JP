package com.telran.prof.hometask.ht18032024.hospice;

import java.util.*;

public class Therapy {

    public Queue<Patient> doctor(ArrayDeque<Patient> registration) {
        PriorityQueue<Patient> docHaus =
                new PriorityQueue<>(new ComparatorPatient());

        while (!registration.isEmpty()){
         registration.peek().setLocation(Phase.BY_DOCTOR);
            docHaus.add(registration.poll());
             }
        List<Patient> patientRealise=new ArrayList<>();

        while (!docHaus.isEmpty()) {
            patientRealise.add(docHaus.poll());
            System.out.println(" \n docHaus " + patientRealise.getLast());
        }
for (Patient persone:patientRealise){
    persone.setLocation(Phase.FREEDOM);
    System.out.println("\n Freedom  : " + persone);
}
      return registration;
    }
}

