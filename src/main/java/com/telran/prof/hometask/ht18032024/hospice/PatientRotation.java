//3)Приложение больница : Имеется регистратура(класс) , в которую обращаются пациенты (класс),
//    пациентов больше 15, очередь в регистратуру может составлять 7 человек, заполнять очередь,
//  пока в ней есть места как только мест не хватает , остановить заполнения и начать
//   обслуживать пациентов в очереди, назначать им терапию(класс) и отправлять в очередь к
//   доктору, очередь доктора должна обслуживать сначала критичных пациентов, потом обычных
//  Когда все пациенты из очереди разобраны в регистратуре, запустить новых и повторить процесс.
//  На каждом этапе выводить в консоль состояние пациента, (в регистратуре, у доктора, свободен)

package com.telran.prof.hometask.ht18032024.hospice;

import java.util.*;

public class PatientRotation {

    public static void main(String[] args) {

        Therapy therapy = new Therapy();

        PriorityQueue<Patient> therapyOfPatients =
                new PriorityQueue<>(new ComparatorPatient());

        List<Patient> patients = Arrays.asList(
                new Patient("Otto", "Bismark", 1,
                        null),
                new Patient("Napoleon", "Buonaparte",3,
                        null),
                new Patient("Benito", "Mussolini",2,
                        null),
                new Patient("Nicola", "Mask",3,
                        null),
                new Patient("Olaf", "Sholz",1,
                        null),
                new Patient("AnnaLena", "Bayerbock",3,
                        null),
                new Patient("Dwight", "Eisenhower",
                       2, null),
                new Patient("Emmanuel", "Macron", 2,
                        null),
                new Patient("Margaret", "Thatcher", 3,
                        null),
                new Patient("LouisXVII", "Burbon", 1,
                        null),
                new Patient("Richard", "Lionheart", 1
                        , null),
                new Patient("Joseph", "Djugashwily", 3,
                        null),
                new Patient("Indira", "Gandy", 2,
                        null),
                new Patient("Adolf", "Shicklgruber", 3, null),
                new Patient("Al", "Capone", 1, null)
        );
Reception receptionWindow = new Reception();
Therapy therapySession=new Therapy();
ArrayDeque<Patient> registrytTeil = new ArrayDeque<>();
        ArrayDeque<Patient> queOne = new ArrayDeque<>();

        for (int i = 0; i <patients.size(); i++) {
            queOne.add(patients.get(i));

            if ((1+i)%7==0||i==patients.size()-1){
                System.out.println("\n At the front entrance    " + queOne);
                registrytTeil = receptionWindow.register(queOne);
                therapySession.doctor(registrytTeil);
            }
        }
 }
}

