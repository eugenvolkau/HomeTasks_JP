package com.telran.prof.hometask.stream_ht_10042024.Employeenames;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employees {
    private static Object Users;

    public static void main(String[] args) {

        List<String> buffString = new ArrayList<>();
        try {
            BufferedReader string = new BufferedReader(new FileReader("C:\\Users" +
                    "\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks\\src\\main\\java\\com\\telran\\prof\\hometask\\stream_ht_10042024\\Employeenames\\inTo.txt"));

            String str = null;
            while (true) {
                try {
                    str = string.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (str == null) {
                    break;
                } else {
                    buffString.add(str);
                }
            }
            int i = 1;
            for (String unit : buffString) {
                System.out.println("N " + i + "    -- " + unit);
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // exercise 1
        List<String> collect =
                Stream.of("Soso", "Kote", "Vaso", "Mamuka", "Vissarion",
                                "Givi", "Koba", "Suliko", "Kahi", "Miho", "Manfred", "Karl", "Bastian")
                        .filter(x -> x.startsWith("K"))
                        .collect(Collectors.toList());
        System.out.println(collect);

        //exercise 2

        List<String> collect1 =
                Stream.of("Soso", "Kote", "Vaso", "Mamuka", "Vissarion",
                                "Givi", "Koba", "Suliko", "Kahi", "Miho", "Manfred", "Karl", "Bastian")
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(collect1);
    }
}


//Задание 1.
//        Задан список фамилий сотрудников.
//        Разработать программу, которая отображает все фамилии, начинающиеся на
//        букву «K». Задачу решить с использованием Stream API.