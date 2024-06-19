package com.telran.prof.hometask.alfabet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class ABChek {

    public static void main(String[] args) {

        Alphabet englishAB = new Alphabet();
        englishAB.setName("English");
        englishAB.printAlphabet();
        EnglishAlphsbet eng = new EnglishAlphsbet();
        eng.printAlphabet();
        printAllInfo(eng.getChars());

        Alphabet deutschAB = new Alphabet();
        deutschAB.setName("Deutsch");
        deutschAB.printAlphabet();
        DeutschAlphabet de = new DeutschAlphabet();
        de.printAlphabet();
        printAllInfo(de.getChars());

        Alphabet greekAB = new Alphabet();
        greekAB.setName("Greek");
        greekAB.printAlphabet();
        GreekAlphabet gr = new GreekAlphabet();
        gr.printAlphabet();
        printAllInfo(gr.getChars());

    }

    public static void printAllInfo(char[] arr) {

        System.out.println(Arrays.toString(arr));
    }
}