package com.telran.prof.hometask.hippodrom;

import java.util.Arrays;

import static com.telran.prof.hometask.hippodrom.HippApp.resultList;

public class Horse implements Runnable {

    private String name;

    private int step;

    private int loopLength;

    private int currentPosition = 0;

    long ellapsTime;

    private String[] resultArr;

    private int resultIndex;

    public Horse(String name, int step, int loopLength, String[] resultArr,
                 int resultIndex) {
        this.name = name;
        this.step = step;
        this.loopLength = loopLength;
        this.currentPosition = currentPosition;
        this.ellapsTime = ellapsTime;
        this.resultArr = resultArr;
        this.resultIndex = resultIndex;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (currentPosition < loopLength) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentPosition += step;

        }
        long endTime = System.currentTimeMillis();

        ellapsTime = endTime - startTime;
        String result1 = String.valueOf(ellapsTime);
        String result2 = String.valueOf(name);
        String result = result1.concat(" -> " + result2);
        resultArr[resultIndex] = result;

    }
}