package com.telran.prof.hometask.hashMap27032024.dictionary;

import java.util.*;
import java.util.stream.Stream;

public class Dictionaru {

    static int goodScan() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return goodScan();
        int chose = sc.nextInt();
        return chose;
    }

    public static void main(String[] args) {
        String word = new String();
        Map<String, String> translation = new HashMap<>();
        int ch = 1;
        while (ch != 0) {
            System.out.println("Enter the word");
            Scanner scr = new Scanner(System.in);
            String newWord = scr.nextLine().toLowerCase();
            if (!translation.containsKey(newWord)) {
                System.out.println("the word " + newWord + " is not in the dictionary" +
                        ".");
                System.out.println("Do you want to add a translation?");
                System.out.println("Yes  - 1 ____ No   - 0");
                ch = goodScan();
                if (ch != 0) {
                    System.out.println("Your translation please  : ");
                    String strTranslate = scr.nextLine();
                    translation.put(newWord, strTranslate);
                    System.out.println(translation.get(newWord));
                }
            } else {
                System.out.println(translation.get(newWord));
            }
            System.out.println("Continue  - 1 _____ Exit   - 0 ");
            ch = goodScan();
            if (ch == 0)
                Stream.of(translation).forEach(element -> System.out.println(translation.entrySet()));
        }
    }
}
