package com.telran.prof.hometask.seaBattle;

public class TestCompare {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a == b) {
            System.out.println("It is equals primitive data");
        } else {
            System.out.println("It is no equals primitive data");
        }
        //Class,array, String,Interface,Enum
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};
        if (arrayOne == arrayTwo) {
            System.out.println("It is equals arrays");
        } else {
            System.out.println("It is no equals arrays");
        }

        String one = "Hello";
        String two = "Hello";
        if (one == two) {
            System.out.println("It is equals string");
        } else {
            System.out.println("It is no equals string");
        }

        String three = new String("Hello");
        if (three == two) {
            System.out.println("It is equals string");
        } else {
            System.out.println("It is no equals string");
        }

        if(one.equals(three)) {
            System.out.println("It is equals string");
        } else {
            System.out.println("It is no equals string");
        }
    }
}