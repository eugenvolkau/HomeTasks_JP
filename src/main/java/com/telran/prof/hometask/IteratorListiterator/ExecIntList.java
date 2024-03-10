package com.telran.prof.hometask.IteratorListiterator;


import java.util.*;
import java.util.ListIterator;

public class ExecIntList {
    private static int goodScan() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return goodScan();
        int chose = sc.nextInt();
        return chose;
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int temp;
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            temp = i;
            list.add(temp);
            System.out.println("temp or ID    :" + temp);
        }
        System.out.println(list);
        long timeEnd = System.currentTimeMillis();
        System.out.println("  We have uploaded the list.  The cycle time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        int n = goodScan();
        if (n == 0) {
            System.exit(0);
        }
        Iterator<Integer> iterator = list.iterator();
// 1 loop
        timeStart = System.currentTimeMillis();
        for (Integer i : list) {
            temp = i;
            System.out.println("list size    " + list.get(i) + "  " + temp);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("       1st loop.  The cycle time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }

// 2 loop

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            temp = i;
            System.out.println("list size    ID    " + list.size() + "   " + temp);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("       2nd loop.   The cycle time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }
        int numbOfmembers;
// 3 loop
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            temp = i;
            numbOfmembers = list.size();
            System.out.println("list size    ID   " + numbOfmembers + "   " + temp);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("      3d loop.  The cycle time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }

// 4 loop
        timeStart = System.currentTimeMillis();
        for (int i = (list.size() - 1); i >= 0; i--) {
            System.out.println("Indexes of 4th loop   ID    " + list.get(i) + "   " + i);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("     4th loop.  The cycle time was" + (timeEnd - timeStart));
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }
// 5 loop
        timeStart = System.currentTimeMillis();
        while (iterator.hasNext()) {

            Integer j = iterator.next();
            System.out.println(" list.get()   ID   " + list.get(j) + "   " + j);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("       5th loop while (Iterator) .   The cycle " +
                "time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }
// 6th loop
        ListIterator<Integer> listIterator = list.listIterator();
        timeStart = System.currentTimeMillis();
        //System.out.println(list);
        while (listIterator.hasNext()) {
            Integer j = listIterator.next();

            System.out.println(" Element   ID   " + j + "   " + list.indexOf(j));
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("   6th loop while (ListIterator).  The cycle time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }

//    7th loop

        ListIterator<Integer> listIterator1 = list.listIterator();
        timeStart = System.currentTimeMillis();
        //System.out.println(list);
        while (listIterator.hasPrevious()) {
            Integer j = listIterator.previous();

            System.out.println(" Element   ID   " + j + "   " + list.indexOf(j));
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("   7th loop while (ListIterator).  The cycle " +
                "time was" + (timeEnd - timeStart));
        System.out.println("Continue  1     Quite   0");
        n = goodScan();
        if (n == 0) {
            System.exit(0);
        }
    }
}






