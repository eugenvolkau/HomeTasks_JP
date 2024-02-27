package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

public class EnglishAlphsbet extends Alphabet {
    char[] chars = new char[26];

    public char[] getChars() {
        return chars;
    }

    @Override
    public void printAlphabet() {
        for (int i = 0; i <chars.length; i++) {
            chars[i] = (char) (i + 97);
        }
        System.out.println(Arrays.toString(chars));
    }
}