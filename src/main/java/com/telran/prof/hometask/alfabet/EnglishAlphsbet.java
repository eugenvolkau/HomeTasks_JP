package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

public class AlphaBet_Eng extends Alphabet {
    char[] arrcharEng = new char[26];

    public char[] getArrcharEng() {
        return arrcharEng;
    }

    @Override
    public void printAlphabet() {
        for (int i = 0; i < 26; i++) {
            arrcharEng[i] = (char) (i + 97);
        }
        System.out.println(Arrays.toString(arrcharEng));
    }
}