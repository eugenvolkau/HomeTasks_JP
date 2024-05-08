package com.telran.prof.hometask.inOutPut15042024.simpleVasyuki;

import java.util.*;

public class CityVasjukiGame {

    public static void main(String[] args) {

        CityInOut startStop = new CityInOut();
        Set<CityVasyuki> subsequenceOfSitys = new HashSet<>();

        System.out.println("A new game?                -  1 ");
        System.out.println("Continue the old game?     -  2 ");

       int select = startStop.setChoice();
        if(select==2){
            subsequenceOfSitys=startStop.readerFromFile();
        }

        startStop.deleter();

        System.out.println("Enter the name of the city  ");
        Scanner scr = new Scanner(System.in);
        String name = "";
        while (!name.equals("EXIT")) {

            name = (scr.nextLine().toUpperCase());
            CityVasyuki cityVasyuki = new CityVasyuki(name);

            String finalName = name;
            long count = subsequenceOfSitys.stream()
                    //.filter(c->c.allMatch(str->str.equals(cityVasyuki.getName())))
                    .filter(cl -> cl.getName().equals(finalName))
                    .count();
            if (count == 4) {
                System.out.println("Learn geography, student!   Game over.");
                return;
            }
            subsequenceOfSitys.add(cityVasyuki);

            System.out.println("Continue?            press -   1");
            System.out.println("Exit without saving? press  -  2");
            System.out.println("Exit and save?   -   press  -  3");
            select=startStop.setChoice();

switch (select){
    case 1:{
        System.out.println("Enter the name of the city  ");
    }
        break;
    case 2:{
        startStop.deleter();
        System.out.println("Until next time.");
        name="EXIT";
    }
    break;
    case 3:
        startStop.WriteToFile((HashSet<CityVasyuki>) subsequenceOfSitys);
        System.out.println("Until next time.");
        name="EXIT";
}

            //System.out.println(cityVasyuki);
        }
        System.out.println(subsequenceOfSitys);

    }
}
