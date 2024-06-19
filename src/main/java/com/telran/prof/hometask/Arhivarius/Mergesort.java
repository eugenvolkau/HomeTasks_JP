package com.telran.prof.hometask.Arhivarius;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import java.io.*;
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

public class Mergesort {
    private static String[] arr;

    public static void main(String[] args) {
        String[] arr = getDateSet();
        String[] aux = Arrays.copyOf(arr, arr.length);
        System.out.println("select a field to sort");
        System.out.println("DAYS press       1");
        System.out.println("MONTHS press     2");
        System.out.println("YEARS press      3");
        int[] stId = getFieldSortSelect();
        mergesort(arr, aux, 0, arr.length - 1, stId);
        System.out.println(Arrays.toString(arr));
        if (isSorted(arr, stId)) {
            // System.out.println(Arrays.toString(arr));
        }
        String tt = "C:\\Users\\eugen\\Scool\\Trenage\\MergeSortDate\\src\\tt.txt";
        writeFile(arr);
    }
    public static void merge(String[] arr, String[] aux, int low, int mid, int high, int[] stId) {
        int k = low, i = low, j = mid + 1;
        // пока есть элементы в левом и правом рядах
        while (i <= mid && j <= high) {
            if (Integer.parseInt(arr[i].substring(stId[0], stId[1])) <= Integer.parseInt(arr[j].substring(stId[0], stId[1]))) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }
        // копируем оставшиеся элементы
        while (i <= mid) {
            aux[k++] = arr[i++];
        }
        // копируем обратно в исходный массив, чтобы отразить порядок сортировки
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }
    }
    public static void mergesort(String[] arr, String[] aux, int low, int high, int[] stId) {
        // базовый вариант
        if (high <= low) {        // если размер прогона <= 1
            return;
        }
        // найти середину
        int mid = (low + ((high - low) >> 1));
        // рекурсивно разделяем прогоны на две половины до тех пор, пока размер прогона не станет <= 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов
        mergesort(arr, aux, low, mid, stId);          // разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high, stId);     // разделить/объединить правую половину
        merge(arr, aux, low, mid, high, stId);        // объединяем две половинки
    }
    // Функция для проверки, отсортирован ли arr в порядке возрастания или нет
    public static boolean isSorted(String[] arr, int[] stId) {
        String prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i - 1].substring(stId[0], stId[1]));
            int b = Integer.parseInt(arr[i].substring(3, 5));
            //System.out.println("a     :  " + a);
            //System.out.println("b      :  " + b);
            if (a > b) {
                //System.out.println("MergeSort Fails!!");
                return false;
            }
        }return true;
    }
    private static String[] getDateSet() {
        Random rnd = new Random();
        String[] dateSet = new String[10];
        System.out.println("  without sorting  ");
        for (int i = 0; i < dateSet.length; i++) {
            int year = rnd.nextInt(1900, 2024);
            int month = rnd.nextInt(1, 12);
            int day = rnd.nextInt(1, 28);
            LocalDate localDate = LocalDate.of(year, month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            dateSet[i] = localDate.format(formatter);
            System.out.println(dateSet[i]);
        }
        return dateSet;
    }
    private static int[] getFieldSortSelect() {
        Scanner sc = new Scanner(System.in);
        int[] stId = new int[2];
        stId[0] = 4;
        stId[1] = 4;
        if (!sc.hasNextInt()) {
            System.out.println("wrong choice made");
            return getFieldSortSelect();
        }
        int sel = sc.nextByte();
        switch (sel) {
            case 1: {
                stId[0] = 0; stId[1] = 2;
            }   break;
            case 2: {
                stId[0] = 3; stId[1] = 5;
            }    break;
            case 3: {
                stId[0] = 6; stId[1] = 10;
            }   break;
        }
        return stId;
    }
    private static void writeFile(String[] arr){
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("C:\\Users\\eugen\\Scool\\Trenage\\DateMergSort\\src\\tt.txt"),true);
            for (int i = 0; i < arr.length; i++) {
                os.write(arr[i].getBytes(),0, arr.length);
                os.write("\n".getBytes());
            }
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
