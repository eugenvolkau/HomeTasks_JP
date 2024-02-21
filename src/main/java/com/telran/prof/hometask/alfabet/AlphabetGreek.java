package com.telran.prof.hometask.alfabet;

import java.util.Arrays;

class AlphabetGreek extends Alphabet {

    int k = 25;
    char[] arrchar_Gr = new char[k];

    public char[] getArrchar_Gr() {
        return arrchar_Gr;
    }

    @Override
    public void printAlphabet() {
        for (int i = 0; i < 25; i++) {
            arrchar_Gr[i] = (char) (i + 945);
        }
        System.out.println(Arrays.toString(arrchar_Gr));
    }
}
