package com.telran.prof.hometask.linkedList06032024;

import java.util.HashSet;
import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {

        boolean test = true;
        HashSet<String> names1 = new HashSet<>();
        HashSet<String> names2 = new HashSet<>();
        HashSet<String> names3 = new HashSet<>();
        HashSet<String> names4 = new HashSet<>();
        HashSet<String> names5 = new HashSet<>();
        while (test) {
            System.out.println("Enter the name of the city");
            Scanner scr = new Scanner(System.in);
            String name = (scr.nextLine().toUpperCase());

            test = names1.add(name) ? true : names2.add(name) ? true : names3.add(name) ? true :
                    names4.add(name) ? true : names5.add(name);
            if (!names5.isEmpty()) {
                for (String element : names1) {
                    System.out.println("unique titles  " + element);
                }
                System.out.println("listed twice  " + names2);
                System.out.println("thrice indicated" + names3);
                System.out.println("mentioned four times   " + names4);
                System.out.println("indicated five times   " + names5);
                System.out.println("This is a fiasco Karl!");
                test = false;
            }
        }
    }
}
