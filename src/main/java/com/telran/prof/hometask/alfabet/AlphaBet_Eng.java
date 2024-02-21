package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

public class AlphaBet_Eng extends Alphabet {
    char[] arrchar_eng = new char[26];

    public char[] getArrchar_eng() {
        return arrchar_eng;
    }

    @Override
    public void printAlphabet() {
        for (int i = 0; i < 26; i++) {
            arrchar_eng[i] = (char) (i + 97);
        }
        System.out.println(Arrays.toString(arrchar_eng));
    }
}