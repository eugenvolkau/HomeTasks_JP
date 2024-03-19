package com.telran.prof.hometask.setsHT11032024;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortIntSet_ht11032024 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> uniSet = new TreeSet<>();
        Set<Integer> duplicatSet = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            Integer numbers = rnd.nextInt(100);

            System.out.print(numbers + " ");
            if (!uniSet.add(numbers))
                duplicatSet.add(numbers);
        }
        System.out.println("\n Uniset \n" + uniSet);
        System.out.println("\n duplicatSet  " + duplicatSet);
    }
}

