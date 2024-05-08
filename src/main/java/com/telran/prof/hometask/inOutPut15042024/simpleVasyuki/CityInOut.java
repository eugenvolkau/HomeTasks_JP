package com.telran.prof.hometask.inOutPut15042024.simpleVasyuki;

import java.io.*;
import java.util.*;
import java.util.Iterator;

public class CityInOut {
    static String path = "C:\\Users\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks" +
            "\\src\\main\\java\\com\\telran\\prof\\hometask" +
            "\\inOutPut15042024\\simpleVasyuki";
    String st = "one.txt";

    public static int setChoice() {

        Scanner choice = new Scanner(System.in);
        int sel = choice.nextInt();

return sel;
    }

    public  void deleter() {

        File fileToDelete = new File(path + "/" + st);
        boolean delete = fileToDelete.delete();
//        System.out.println("file from files is delete ? " + delete);
        System.out.println("Good luck! ");

    }

    public Set<CityVasyuki> readerFromFile() {
        File file = new File(path);

        Set<CityVasyuki> set = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path +
                "/" + st))) {
            while (bufferedReader.ready()) {
                set.add(new CityVasyuki(bufferedReader.readLine()));
//                CityVasyuki vasyuki = new CityVasyuki(bufferedReader.readLine());
            }

        } catch (Exception exception) {
        }
        return set;
    }

    public void WriteToFile(HashSet<CityVasyuki> set) {

        Iterator<CityVasyuki> cityVasyukiIterator = set.iterator();
        try (
                FileWriter writer = new FileWriter(path + "/" + st);) {
            while (cityVasyukiIterator.hasNext()) {

                writer.write(cityVasyukiIterator.next() + "\n");
            }

        } catch (
                IOException exception) {
            System.out.println("We have a problem" + exception.getMessage());
        }
    }
}



