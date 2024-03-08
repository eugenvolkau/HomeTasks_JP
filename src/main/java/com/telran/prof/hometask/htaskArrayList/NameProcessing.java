package com.telran.prof.hometask.htaskArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameProcessing {

    public static void main(String[] args) {


        AnLagerOfNext str = new AnLagerOfNext(new String[]{"Anna", "Taras", "Alesia", "Agripina", "Taras", "Panas",
                "Stanislav", "Alesia", "Max", "Taras", "Pavlo", "Alesia"});
        List<String> numberOfNames = new ArrayList<>();
        Iterator<String> iterator = str.iterator();

        while (iterator.hasNext()) {
            String name = new String();
            name = iterator.next();
            System.out.print(name.length() + " букав     ");
            System.out.println(name);
            numberOfNames.add(name);
        }
        System.out.println("Before    " + numberOfNames);
        List<String> clearName = new ArrayList<>();
        for (int i = 0; i < numberOfNames.size() - 1; i++) {
            for (int j = i + 1; j < numberOfNames.size(); j++) {
                if (numberOfNames.get(i).equals(numberOfNames.get(j))) {
                   numberOfNames.set(j,"");
                   }
            }
        }
        numberOfNames.removeIf(n ->(n.equals("")));
        System.out.println("After      " + numberOfNames);
    }
}


// 1 уровень сложности: 1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
//         2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
//         3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
//         4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
//
//         2 уровень сложности: