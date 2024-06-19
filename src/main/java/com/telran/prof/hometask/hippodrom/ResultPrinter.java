package com.telran.prof.hometask.hippodrom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultPrinter implements Runnable {

    private String[] result;

    public ResultPrinter(String[] result) {
        this.result = result;
    }

    public String[] getResult() {
        return result;
    }

    @Override
    public void run() {

        boolean isDone = false;
        while (!isDone) {
            isDone = true;
            for (String resultString : result) {
                if (resultString == null) {
                    isDone = false;
                }
            }
        }
        //redo sorting by the numeric part of the String
        Arrays.stream(result).
                sorted().forEach(String -> System.out.println(String));
    }
}
