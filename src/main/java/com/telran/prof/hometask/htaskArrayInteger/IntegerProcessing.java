package com.telran.prof.hometask.htaskArrayInteger;

import com.telran.prof.hometask.IteratorListiterator.IntegerNext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerProcessing {
    public static void main(String[] args) {
        IntegerNext<Integer> num = new IntegerNext<Integer>(new Integer[]{0, 1
                , 1, 2, 3, 5, 8, 13, 21, 0, 1, 1, 2, 3});

        List<Integer> numberOfNum = new ArrayList<>();
        Iterator<Integer> iterator = num.iterator();

        List<Integer> numberOfNumTwo = new ArrayList<>();

        while (iterator.hasNext()) {

            Integer number = iterator.next();
            numberOfNum.add(number);
            numberOfNumTwo.add(number * 2);
        }

        System.out.println("numberOfNum" + numberOfNum);
        System.out.println("After multiplying by 2   " + numberOfNumTwo);


        numberOfNum.removeIf(n -> (n % 2 == 0));
        System.out.println("only odd numbers      " + numberOfNum);
    }
}

