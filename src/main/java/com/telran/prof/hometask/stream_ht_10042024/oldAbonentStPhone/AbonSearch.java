package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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

        Abonents norbert = new Abonents(3, "Norbert", 99);
        norbert.addPhone(new Phones(51112223, PhoneType.LANDLINEPHONE));
        norbert.addPhone(new Phones(61112223, PhoneType.MOBILE));

        Abonents adolf = new Abonents(4, "Adolf", 22);
        adolf.addPhone(new Phones(71112223, PhoneType.MOBILE));
        adolf.addPhone(new Phones(81112223, PhoneType.MOBILE));

        //System.out.println(norbert);
        List<Abonents> abonents = Arrays.asList(adolf, norbert, karl, friedhelm);

        Optional<Phones> oldest = abonents.stream()
                .sorted((s1, s2) -> s2.getAge() - s1.getAge())
                .map(x -> x.getPhonesOfAbonents())
                .flatMap(phones -> phones.stream())
                .filter(type -> type.getPhoneType().equals(PhoneType.LANDLINEPHONE))
                .findFirst();

        System.out.println(oldest);
     //  And now I want to identify the person involved by the number. Although it is known that this is Norbert.

    }
}
