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
            for (String unit:buffString){
                System.out.println("N " + i + "    -- " + unit);
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // exercise 1
                    List < String > collect =
                    Stream.of("Soso", "Kote", "Vaso", "Mamuka", "Vissarion",
                                    "Givi", "Koba", "Suliko", "Kahi", "Miho", "Manfred", "Karl", "Bastian")
                            .filter(x -> x.startsWith("K"))
                            .collect(Collectors.toList());
            System.out.println(collect);

            //exercise 2

        List < String > collect1 =
                Stream.of("Soso", "Kote", "Vaso", "Mamuka", "Vissarion",
                                "Givi", "Koba", "Suliko", "Kahi", "Miho", "Manfred", "Karl", "Bastian")
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(collect1);
    }
}






// System.out.println("Enter number from  1 to 99");
//         System.out.println(getStr());
//         }
//private   static int getNum() {
//        Scanner scn = new Scanner(System.in);
//        //&&(1<scn.nextInt()&&100>scn.nextInt())
//        if (scn.hasNextInt()){
//        return scn.nextInt();}
//
//        else {
//        System.out.println("Enter number from  1 to 99");
//        return getNum();
//        }
//        }
//private static StringBuilder getStr() {
//        int num1 = getNum()+1;
//        if(0 > num1|| num1 >= 100)
//        System.out.println((num1-1) + "    the numbers are unrealistic");
//        Scanner sc = null;
//        try {
//        sc = new Scanner(new File("C:\\Users\\eugen\\Scool\\HTask\\Ubiley\\weddingAn.txt"));
//        } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//        }
//        List<String> lines = new ArrayList<>();
//        while (sc.hasNextLine()) {
//        lines.add(sc.nextLine());
//        }
//        String[] arr = lines.toArray(new String[lines.size()]);
//        int a = arr.length;
//        StringBuilder subNum1 = new StringBuilder(String.valueOf(num1));
//        subNum1.insert(0, " ");
//        subNum1.insert(subNum1.length(), " ");
//        //System.out.println(subNum1);
//        String congratul = num1 == 13 ? " 14 " : num1 == 54 ? " 55 " : (num1 >=0) && (num1 < 70) ? String.valueOf(subNum1) : (num1 > 70) && (num1 < 75)
//        ? " 75 " : (num1 > 75) && (num1 < 80) ? " 80 " : (num1 > 80) && (num1 < 85) ? " 85 " : (num1 > 85) && (num1 < 90) ? " 90 " : (num1 > 90) && (num1 < 95) ? " 95 "
//        : num1 > 95 && num1 <= 100 ? " 100 " : null;
//        StringBuilder subNum2 = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//        if (0<=arr[i].indexOf(congratul)) {
//        System.out.println(arr[i].indexOf(congratul));
//        subNum2.append(arr[i]);
//        return subNum2;
//        }
//        }
//        System.out.println(subNum1);
//        return subNum1;

//Задание 1.
//        Задан список фамилий сотрудников.
//        Разработать программу, которая отображает все фамилии, начинающиеся на
//        букву «K». Задачу решить с использованием Stream API.