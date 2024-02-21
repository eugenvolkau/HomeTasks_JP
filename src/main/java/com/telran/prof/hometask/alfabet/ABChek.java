package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

public class ABChek {

    public static void main(String[] args) {

        Alphabet englishAB = new Alphabet();
        englishAB.setName("English");
        englishAB.printAlphabet();
        AlphaBet_Eng eng = new AlphaBet_Eng();
        eng.printAlphabet();
        printAllInfo(eng.getArrchar_eng());

        Alphabet deutschAB = new Alphabet();
        deutschAB.setName("Deutsch");
        deutschAB.printAlphabet();
        Alphabet_De de = new Alphabet_De();
        de.printAlphabet();
        printAllInfo(de.getArrchar_De());

        Alphabet greekAB = new Alphabet();
        greekAB.setName("Greek");
        greekAB.printAlphabet();
        AlphabetGreek gr = new AlphabetGreek();
        gr.printAlphabet();
        printAllInfo(gr.getArrchar_Gr());

    }

    public static void printAllInfo(char[] arr) {

        System.out.println(Arrays.toString(arr));
    }
}