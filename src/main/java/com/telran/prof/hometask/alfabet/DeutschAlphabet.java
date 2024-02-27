package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

public class DeutschAlphabet extends Alphabet {
    int k = 30;
    char[] chars = new char[k];

    public char[] getChars() {
        return chars;
    }

    @Override
    public void printAlphabet() {
        int n = 97;
        for (int i = 0; i <chars.length; i++) {

            chars[i] = (i + 97 == 98) ? (char) (228) : (i + 97 == 113) ?
                    (char) (246) : (i + 97 == 118) ? (char) (223) :
                    (i + 97 == 121) ? (char) (252) : (char) (n);
            n = ((i + 97 == 98) || (i + 97 == 113) || (i + 97 == 118) || (i + 97 == 121)) ? n : (n + 1);
        }
        System.out.println(Arrays.toString(chars));
    }
}




