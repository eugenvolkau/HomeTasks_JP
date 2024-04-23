package com.telran.prof.hometask.inOutPut15042024.NewVasjuki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CityOutZip {

    public void outVasjuki(HashSet<String> hashSet, String st) {
        String pathOut = "C:\\Users\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks" +
                "\\src\\main\\java\\com\\telran\\prof\\hometask" +
                "\\inOutPut15042024\\NewVasjuki";
        Iterator<String> set = hashSet.iterator();
        try (
                FileWriter writer = new FileWriter(pathOut + "/" + st);) {
            while (set.hasNext()) {

                writer.write(set.next() + "\n");
            }

        } catch (
                IOException exception) {
            System.out.println("We have a problem" + exception.getMessage());
        }
    }
}
