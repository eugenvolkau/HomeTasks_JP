package com.telran.prof.hometask.seaBattle;

public class TestArray {

    private static final int LENGTH_OF_ARRAY = 5;

    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arrayTwo = new int[]{2, 3, 4, 5, 6, 7};
        int[] arrayThree = {3, 4, 5, 6, 7, 8, 9};
        int[] arrayfour;
        //String hello = null;

        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println("Element by index = " + arrayThree[i]);
        }

        for (int element : arrayTwo) {
            System.out.println("Element by index = " + element);
        }


    }
}
