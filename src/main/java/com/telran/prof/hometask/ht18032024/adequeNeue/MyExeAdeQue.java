package com.telran.prof.hometask.ht18032024.adequeNeue;

import java.util.Iterator;
import java.util.Random;

public class MyExeAdeQue {
    public static void main(String[] args) {

        Random rnd = new Random();

        ExeQuetion exeArrayDeQue = new ExeQuetion(32);
        exeArrayDeQue.addToHead(10);
        exeArrayDeQue.addToHead(15);
        exeArrayDeQue.addToHead(18);
        exeArrayDeQue.addToTail(5);
        exeArrayDeQue.addToTail(6);
        exeArrayDeQue.addToTail(8);
        System.out.print(" full " + exeArrayDeQue);
        System.out.println();
        //8 5 10 15
        System.out.println(" peek ");
        System.out.println(exeArrayDeQue.peekHead());
        System.out.println(exeArrayDeQue.peekTail());

        System.out.println(" pool  ");
        System.out.println(exeArrayDeQue.poolHead());
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue.poolTail());

        System.out.println(exeArrayDeQue);
        System.out.println("------------------");
        System.out.println(" addHead ");
        for (int i = 0; i < 10; i++) {
            exeArrayDeQue.addToHead(rnd.nextInt(1, 100));
        }
        System.out.println(exeArrayDeQue);
        System.out.println("------------------");
        System.out.println(" addTail ");
        for (int i = 0; i < 12; i++) {
            exeArrayDeQue.addToTail(rnd.nextInt(1, 100));
        }

        System.out.println(exeArrayDeQue);
        System.out.println("----------------");
        System.out.println(" poolTail ---->  ");

        System.out.println(exeArrayDeQue);
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue);
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue);
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue);
        System.out.println(exeArrayDeQue.poolTail());
        System.out.println(exeArrayDeQue);

        System.out.println(" poolHead <----  ");
        System.out.println(exeArrayDeQue.poolHead());
        System.out.println(exeArrayDeQue);
        System.out.println(exeArrayDeQue.poolHead());
        System.out.println(exeArrayDeQue);

        Iterator<Integer> iterator = exeArrayDeQue.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.print(" " + current);
        }
    }
}


