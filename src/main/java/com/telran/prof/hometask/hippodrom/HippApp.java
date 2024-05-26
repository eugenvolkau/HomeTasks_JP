package com.telran.prof.hometask.hippodrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HippApp {

    public static List<String> resultList = new ArrayList<>();

    public static void main(String[] args) {

        int loopLength = 10001;

        Random random = new Random();

        String[] result = new String[9];

        List<Horse> horses = Arrays.asList(
                new Horse(" Rosinante ", random.nextInt(50, 150),
                        loopLength, result, 0),
                new Horse(" Pegasus ", random.nextInt(50, 150), loopLength,
                        result, 1),
                new Horse("Bucephalus ", random.nextInt(50, 150),
                        loopLength, result, 2),
                new Horse("Eclipse ", random.nextInt(50, 150), loopLength,
                        result, 3),
                new Horse("Tony ", random.nextInt(50, 150), loopLength,
                        result, 4),
                new Horse("Incitatus ", random.nextInt(50, 150), loopLength,
                        result, 5),
                new Horse("sampson ", random.nextInt(50, 150), loopLength,
                        result, 6),
                new Horse("Absent ", random.nextInt(50, 150), loopLength,
                        result, 7),
                new Horse("Hans ", random.nextInt(50, 150), loopLength,
                        result, 8)
        );
        System.out.println("Start : ");
        for (Horse horse : horses) {
            new Thread(horse).start();
        }
        new Thread(new ResultPrinter(result)).start();
    }
}


