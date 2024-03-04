package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMaker {
    ArrayList orderNew = new ArrayList<>();

    public ArrayList<String> getOrderNew() {
        return orderNew;
    }

    int numberOfOrder;

    public OrderMaker() {
    }

    public int goodScan() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return goodScan();
        int chose = sc.nextInt();
        return chose;
    }
    public List<String> goodsOrderMaker(ArrayList<String> list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
            System.out.println("Order  Yes  1   No   0 ");
            int n = goodScan();
            if (n != 1) {
                continue;
            } else {
                orderNew.add(list.get(j));
                list.set(j, null);
                System.out.println(orderNew);
            }
        }
        for (int j = 0; j < orderNew.size(); j++) {
            if (orderNew.get(j) == null) {
                orderNew.remove(j);
            }
        }
        System.out.println("Order list  " + orderNew);
        System.out.println("leftovers   " + list);
        return orderNew;
    }

}