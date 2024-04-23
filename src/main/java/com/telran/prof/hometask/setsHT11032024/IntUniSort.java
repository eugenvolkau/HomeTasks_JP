package com.telran.prof.hometask.setsHT11032024;
//Взять две строки случайных символов ,длина каждой строки
////         от 20 до 50 символов.

import java.util.Set;
import java.util.TreeSet;

public class IntUniSort {
    public static void main(String[] args) {

        String inputstring1 = "asdfasqdfasdf asdfgfhghjjhwdfgfggg ";
        String inputstring2 = " fdgdsgfpsdgfdsgfjfghefgnvcx tsjsyjnjhu7junhbf";
        String inputstring3 = inputstring1.concat(inputstring2);
        char[] chars = inputstring3.toCharArray();
        Set<Character> characters = new TreeSet<>();
        Set<Character> duplicatSet = new TreeSet<>();
        for (char temp : chars) {
            if (!characters.add(temp)) {
                duplicatSet.add(temp);
            }
        }
        for (char value : characters)
            if (!duplicatSet.contains(value)) {
                System.out.println("Unique element  :" + value);
            }

    }
}
