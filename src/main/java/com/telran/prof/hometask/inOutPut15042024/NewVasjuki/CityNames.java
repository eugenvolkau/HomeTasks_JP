package com.telran.prof.hometask.inOutPut15042024.NewVasjuki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityNames {

    public static void main(String[] args) {
        CityInZip beginig = new CityInZip();

        System.out.println("A new game?                -  1 ");
        System.out.println("Continue the old game?     -  2 ");
        beginig.newChoice();
        List<HashSet> names4321 = beginig.reservoirs();

        CityOutZip vasjukiOut = new CityOutZip();
        ChoiceScript choiceScript = new ChoiceScript();

        boolean test = true;
        HashSet<String> names1 = names4321.get(0);
        HashSet<String> names2 = names4321.get(1);
        HashSet<String> names3 = names4321.get(2);
        HashSet<String> names4 = names4321.get(3);
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
//                continue;
                }
                System.out.println("indicated five times   " + names5);
                System.out.println("This is a fiasco Karl!");
                test = false;
            }
            List<HashSet> names1234 = Arrays.asList(names1, names2, names3,
                    names4);
            System.out.println("Continue? press - 1      Exit without saving?  " +
                    "press  - 2    Exit and save?   -  press  -3");
            test = choiceScript.setChoice(names1234);
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

//    Не обязательная : Для игры в города из прошлой домашки на Set,
//        сделайте опцию, чтобы можно было выбрать сохранение в течении
//        игры и сохранить состояние введенных городов в файл. При старте
//        программы, если файл сохранения существует, предлагать продолжить
//        или начать новую игру