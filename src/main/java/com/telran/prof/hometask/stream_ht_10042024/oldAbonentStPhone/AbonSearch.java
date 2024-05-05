package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import com.telran.prof.hometask.stream_ht_10042024.AlternatOldAbon.AlternateAgeComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbonSearch {

    public static void main(String[] args) {

        Abonents karl = new Abonents(1, "Karl", 38);
        karl.addPhone(new Phones(11122233, PhoneType.LANDLINEPHONE));
        karl.addPhone(new Phones(21112223, PhoneType.MOBILE));

        Abonents friedhelm = new Abonents(2, "Friedhelm", 48);
        friedhelm.addPhone(new Phones(0, PhoneType.MOBILE));
        friedhelm.addPhone(new Phones(41112223, PhoneType.MOBILE));

        Abonents norbert = new Abonents(3, "Norbert", 79);
        norbert.addPhone(new Phones(51112223, PhoneType.LANDLINEPHONE));
        norbert.addPhone(new Phones(11111111, PhoneType.MOBILE));

        Abonents adolf = new Abonents(4, "Adolf", 89);
        adolf.addPhone(new Phones(71112223, PhoneType.MOBILE));
        adolf.addPhone(new Phones(0, PhoneType.LANDLINEPHONE));

        List<Abonents> abonents = Arrays.asList(adolf, norbert, karl,
        friedhelm);

        System.out.println(Objects.requireNonNull(abonents.stream()
                .filter(cl -> cl.getPhonesOfAbonents().stream()
                        .anyMatch(c ->PhoneType.LANDLINEPHONE.equals(c.getPhoneType())&&c.getPhone()!=0))
                .max(new AgeComparator()   ).orElse(null)).toString());


    }

}

