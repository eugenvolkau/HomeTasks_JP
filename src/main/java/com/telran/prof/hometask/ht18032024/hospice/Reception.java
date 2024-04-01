package com.telran.prof.hometask.ht18032024.hospice;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Reception {

    public ArrayDeque<Patient> register( ArrayDeque<Patient> queOne){
                    ArrayDeque<Patient> reception =
                    new ArrayDeque<>();

            while (!queOne.isEmpty()){
               queOne.peek().setLocation(Phase.BY_RECEPTION);
               reception.add(queOne.poll());
            }
            System.out.println("Reception  " + reception);
        return  reception;
        }
    }
