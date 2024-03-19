package com.telran.prof.hometask.setsHT11032024.cityGame;

import java.util.HashSet;
import java.util.Scanner;

public class CityNames {

    public static void main(String[] args) {

        boolean test = true;
        HashSet<String> names1 = new HashSet<>();
        HashSet<String> names2 = new HashSet<>();
        HashSet<String> names3 = new HashSet<>();
        HashSet<String> names4 = new HashSet<>();
        HashSet<String> names5 = new HashSet<>();
        while (test) {
            System.out.println("Enter the name of the city");
            Scanner scr = new Scanner(System.in);
            String name = (scr.nextLine().toUpperCase());

            test = names1.add(name) ? true : names2.add(name) ? true : names3.add(name) ? true :
                    names4.add(name) ? true : names5.add(name);
            if (!names5.isEmpty()) {
                for (String element : names1) {
                    System.out.println("unique titles  " + element);
                }
                System.out.println("listed twice  " + names2);
                System.out.println("thrice indicated" + names3);
                System.out.println("mentioned four times   " + names4);
                System.out.println("indicated five times   " + names5);
                System.out.println("This is a fiasco Karl!");
                test = false;
            }
        }
    }
}
  //  Мини игра:
//         С консоли два игрока , по очереди вводят название городов.
//         Каждое введенное название города нужно запомнить в структуре данных.
//         Но запоминать нужно не как строку, а как объект класса City, который
//         содержит поле с названием города.
//         Если игрок вводит название города , которое уже раньше
//         использовалось , то увеличивать счетчик повторений на 1.
//         Когда счетчик повторений достигнет 5 - игра останавливается и
//         выводится список всех названных городов и список всех
//         городов что были названые два и более раз.
//         Города хранить в HashSet.