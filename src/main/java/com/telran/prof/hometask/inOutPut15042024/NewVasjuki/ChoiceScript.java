package com.telran.prof.hometask.inOutPut15042024.NewVasjuki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ChoiceScript {
    boolean result;

    public boolean setChoice(List<HashSet> n1) {
        CityOutZip vasjukiOut = new CityOutZip();
        String[] st = {"one.txt", "two.txt", "three.txt", "Four.txt"};
        Scanner choice = new Scanner(System.in);
        int sel = choice.nextInt();
        switch (sel) {

            case 1: {

                result = true;
            }
            break;
            case 2: {

                System.exit(0);
            }
            break;

            case 3: {
                int i = 0;
                for (HashSet unit : n1) {
                    vasjukiOut.outVasjuki(unit, st[i]);
                    i++;
                }
                System.exit(0);
            }
            break;

            default:
                System.out.println("Read the warnings carefully.");
                result = true;
        }
        return result;
    }
}

