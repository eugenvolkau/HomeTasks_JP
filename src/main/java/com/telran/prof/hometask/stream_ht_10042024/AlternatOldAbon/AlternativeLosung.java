package com.telran.prof.hometask.stream_ht_10042024.AlternatOldAbon;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AlternativeLosung {

    public static void main(String[] args) {


 List<Client> clients = Arrays.asList(new Client(1, "Oleh", 29,
                 List.of(new Phone("+4802656596", "home"), new Phone("+3569852563", "cellular"))),
        new Client(1, "Mania", 60, List.of(new Phone(null, "home"), new Phone("+3895626216", "cellular"))),
        new Client(2, "Kolia", 30, List.of(new Phone(null, "home"),
                new Phone("+3125145663", "cellular"))),
        new Client(3, "Tolik", 54, List.of(new Phone("+7859625633", "home"),
                new Phone("+9632255812", "cellular"))),
        new Client(4, "Nastia", 12, List.of(new Phone(null, "home"),
                new Phone("+8626633263", "cellular"))),
        new Client(5, "Zina", 22, List.of(new Phone("+4459625632", "home"),
                new Phone("+45266963263", "cellular"))));

        System.out.println(Objects.requireNonNull(clients.stream()
        .filter(cl -> cl.getPhones().stream()
        .anyMatch(c -> c.getNumber() != null && c.getType().equals("home")))
        .max(new AlternateAgeComparator()   ).orElse(null)).toString());
}
}
//
