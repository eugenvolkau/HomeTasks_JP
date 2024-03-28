package com.telran.prof.hometask.ht18032024.Solitaer;

import java.util.*;

public class ExecSolitair {

    public static void main(String[] args) {
        Batcher batcher = new Batcher();
        List<Decker> decker = batcher.batcher();
        List<Decker> solitair = new ArrayList<>();
        Stack<Decker> deckerStack = new Stack<>();
        Stack<Decker> deckerStack1 = new Stack<>();

        int i = 0;
        while (i < 52) {
            deckerStack.push(decker.get(i));
            i++;
        }
        i = 0;
        while (!deckerStack.isEmpty()) {
            deckerStack1.push(deckerStack.pop());
            if (deckerStack.peek().equals(deckerStack1.peek())) {
                deckerStack1.push(deckerStack.pop());
            } else {
                deckerStack1.pop();
                deckerStack.pop();
                i++;
            }
        }
        i = 0;
        while (!deckerStack1.isEmpty()) {
            System.out.println(i + "cell of dS1  " + deckerStack1.pop());
            i++;
        }
        if (i < 5)
            System.out.println("There are " + i + " cards on the table. This " +
                    "is a victory Karl!");
        System.out.println("\"There are " + i + " cards on the table. This is a fiasco Karl!");

    }
}



