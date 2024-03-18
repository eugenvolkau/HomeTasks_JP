package com.telran.prof.hometask.linkedList06032024;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestCustomLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
        list.addFirst(10);
        list.addFirst(15);
        System.out.println(list);
        list.add(1, 20);

        System.out.println(list);

        list.add(4, 30);
        System.out.println(list);

        list.add(0, 40);
        list.add(0, 55);

        System.out.println(list);
        System.out.println("Size of Linked list  " + list.size());

        list.remove(5);

        System.out.println("Afte removing " + list);
        System.out.println("Size of Linked list  " + list.size());

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " & ");}
            System.out.println("\n &&&&&&&&&&&&& ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " & ");
        }
        }
    }
