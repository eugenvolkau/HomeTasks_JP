package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbonSearch {

    public static void main(String[] args) {

        Abonents karl = new Abonents(1, "Karl", 38);
        karl.addPhone(new Phones(11122233, PhoneType.LANDLINEPHONE));
        karl.addPhone(new Phones(21112223, PhoneType.MOBILE));

        Abonents friedhelm = new Abonents(2, "Friedhelm", 48);
        friedhelm.addPhone(new Phones(31112223, PhoneType.MOBILE));
        friedhelm.addPhone(new Phones(41112223, PhoneType.MOBILE));

        Abonents norbert = new Abonents(3, "Norbert", 79);
        norbert.addPhone(new Phones(51112223, PhoneType.MOBILE));
        norbert.addPhone(new Phones(61112223, PhoneType.LANDLINEPHONE));

        Abonents adolf = new Abonents(4, "Adolf", 89);
        adolf.addPhone(new Phones(71112223, PhoneType.MOBILE));
        adolf.addPhone(new Phones(81112223, PhoneType.MOBILE));

        //System.out.println(norbert);
        List<Abonents> abonents = Arrays.asList(adolf, norbert, karl, friedhelm);

        // Find Tne TelNum
        Optional<Integer> oldest = abonents.stream()
                .sorted((s1, s2) -> s2.getAge() - s1.getAge())
                .map(x -> x.getPhonesOfAbonents())
                .flatMap(phones -> phones.stream())
                .filter(type -> type.getPhoneType().equals(PhoneType.LANDLINEPHONE))
                .map(unit -> unit.getPhone())
                .findFirst();
        int num = oldest.get();

        System.out.println("Option  oldest  " + oldest + "   int   num   " + num);

        for (Abonents element : abonents) {

            for (Phones unit : element.getPhonesOfAbonents()) {

                if (num == (unit.getPhone())) {

                    System.out.println("The client has upgrow");
                    System.out.println("Ident Num  : " + element.getId() + " " +
                            "his " +
                            "name was   " + element.getName() + "  " + element.getAge() + "   Years old");
                    return;
                }
            }
        }
    }

}

