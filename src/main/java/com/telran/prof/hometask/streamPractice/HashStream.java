package com.telran.prof.hometask.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashStream {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("asdf", "zxcvb", "fghjklk");
        System.out.println(str);
        List<String> stringList = str.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
