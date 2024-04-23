package com.telran.prof.hometask.inOutPut15042024.NewVasjuki;

import java.io.*;
import java.util.*;

public class CityInZip {
    String pathIn = "C:\\Users\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks" +
            "\\src\\main\\java\\com\\telran\\prof\\hometask" +
            "\\inOutPut15042024\\NewVasjuki";
    String[] st = {"one.txt", "two.txt", "three.txt", "Four.txt"};

    public void newChoice() {
        CityOutZip vasjukiOut = new CityOutZip();

        Scanner choice = new Scanner(System.in);
        int sel = choice.nextInt();
        switch (sel) {
            case 1: {
                deleter(pathIn, st);

                for (int i = 0; i < st.length + 1; i++) {

                }
//                Set<String> vasjuki = new HashSet<>();
            }
            break;
            case 2: {

                //deleter(pathIn, st);
            }
            break;

            default: {
                System.out.println("Read the warnings carefully.");
            }
        }
    }

    private static void deleter(String pathIn, String[] st) {
        int i = 0;
        for (String unit : st) {

            File fileToDelete = new File(pathIn + "/" + unit);
            boolean delete = fileToDelete.delete();
            System.out.println("file from files is delete ? " + delete);
            System.out.println("Good luck! ");
            i++;
        }
    }

    public List<HashSet> reservoirs() {
        File file = new File(pathIn);

        HashSet<String> n1 = new HashSet<>();
        HashSet<String> n2 = new HashSet<>();
        HashSet<String> n3 = new HashSet<>();
        HashSet<String> n4 = new HashSet<>();
        HashSet<String> n5 = new HashSet<>();
        List<HashSet> list = Arrays.asList(n1, n2, n3, n4, n5);

        if (file.exists()) {
            int i = 0;
            for (Set unit : list) {
                try (
                        BufferedReader bufferedReader =
                                new BufferedReader(new FileReader(pathIn +
                                        "/" + st[i]))) {
                    while (bufferedReader.ready()) {
                        unit.add(bufferedReader.readLine());
                    }
                    i++;
                } catch (Exception exception) {
                }
            }
        }
        return list;
    }
}