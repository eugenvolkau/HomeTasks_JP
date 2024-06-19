package com.telran.prof.hometask.CardPocker;

import java.util.List;
import java.util.Spliterator;
import java.util.Stack;

public class PassAnusSolitar {


    public static void main(String[] args) {
        Batch batch = new Batch();
        batch.getlotOfCards();

        List<String> deck1;
        deck1 = batch.getDeckTemp();
        String str = deck1.get(1);

        Stack stack = new Stack<>();
        Stack recycling = new Stack();

//        System.out.println(str);

        for (int i = 0; i < deck1.size() - 1; i++) {
            String[] str1 = (deck1.get(i + 1)).split(" ");
            String[] str2 = (deck1.get(i)).split(" ");
            if (str1[1].equals(str2[1])) {
                recycling.push(deck1.get(i));

                recycling.push((deck1.get(i + 1)));

                deck1.remove(i + 1);
                deck1.remove(i);
                i++;
            } else {
                stack.push(deck1.get(i));


            }
        }
        int i = 1;
        deck1.clear();
        System.out.println("Dry residue");

        while (!stack.empty()) {
            recycling.push(stack.pop());
            i++;
            if (i <= 52 && !stack.empty()) {
               System.out.println(i + "    :  " + recycling.peek());
//            } else {
//                String str1 = recycling.peek();
//                String[] str2 = (deck1.get(i)).split(" ");
//                String[] str3 = (deck1.get(i)).split(" ");
//                String[] str4 = (deck1.get(i)).split(" ");
//                if (str1[1].equals(str2[1].equals(str3[1].equals(str4[1])))) {
//                    System.out.println("victory  " + str1 + str2 + str3 + str4);
//                } else {
//                    System.out.println("This is a wound" + str1 + str2 + str3 + str4);
//                    System.out.println(recycling.);
//                }
//                //System.out.println(i + " : " + stack.pop());

//
//            }

//        while (!recycling.empty()){
//            System.out.println("Coincidences   :  \n");
                //}
            }
        }
    }  }