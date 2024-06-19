package com.telran.prof.hometask.seaBattle;

import java.util.Arrays;

public class TestClone {

    public static void main(String[] args) {
        int[] arrayOne  = {1,2,3,4,5};

        int[] arrayTwo = arrayOne;
        arrayTwo[1] = 7;
        System.out.println(Arrays.toString(arrayOne));

        int[] cloneArray = arrayOne.clone();
        System.out.println("Clone array " + Arrays.toString(cloneArray));
        System.out.println("Is equals = " + (arrayOne == cloneArray));

        // clone for 2D array

        int[][] arrayThree = {{10,20,30},{40,50}};
        int[][] cloneArrayTwo = arrayThree.clone();
        System.out.println("Is equals 2D = " + (arrayThree == cloneArrayTwo));
        System.out.println("Is equals = " + (arrayThree[0] == cloneArrayTwo[0]));
        System.out.println("Is equals = " + (arrayThree[1] == cloneArrayTwo[1]));
    }
}
