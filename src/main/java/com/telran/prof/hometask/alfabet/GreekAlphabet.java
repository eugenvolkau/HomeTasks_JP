package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

class GreekAlphabet extends Alphabet {

    int k = 25;
    char[] chars = new char[k];

    public char[] getChars() {
        return chars;
    }

    @Override
    public void printAlphabet() {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (i + 945);
        }
        System.out.println(Arrays.toString(chars));
    }
}
