package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Depots {
    ProdaFood[] foods = ProdaFood.values();
    ProdaBook[] books = ProdaBook.values();
    ProdaTech[] teches = ProdaTech.values();
    ArrayList<String> aVALABILITY = new ArrayList<>();
    List<List<String>> depotIncom = new ArrayList<List<String>>();
    List<String> depotExpense = new ArrayList<>();

    public ArrayList<String> getaVALABILITY() {
        return aVALABILITY;
    }

    public List<List<String>> getDepotIncom() {
        return depotIncom;
    }


    public List<String> getDepotExpense() {
        return depotExpense;
    }

    public void depotsGoods() {
        String[] arrAvailability = new String[foods.length + books.length + teches.length];
        for (int i = 0; i < foods.length; i++) {
            arrAvailability[i] = String.valueOf(foods[i]);
        }
        System.out.println(Arrays.toString(arrAvailability));
        for (int i = 0; i < books.length; i++) {
            arrAvailability[i + foods.length] = String.valueOf(books[i]);
        }
        System.out.println(Arrays.toString(arrAvailability));
        for (int i = 0; i < books.length; i++) {
            arrAvailability[i + foods.length + books.length] = String.valueOf(teches[i]);
        }
        for (int i = 0; i < arrAvailability.length; i++) {
            aVALABILITY.add(arrAvailability[i]);
        }
        System.out.println(aVALABILITY);
        System.out.println("This is a complete list of products in our warehouse");
    }

    public List<String> depotIncomFirst(List<String> incom,
                                        List<String> capacityAll) {
        for (String unit : incom) {
            depotIncom.add(Collections.singletonList(unit));
        }
        System.out.println("The goods have now arrived at the warehouse  ");
        return incom;
    }

    public List<String> depotExpenseFirst(List<String> depotExpense,
                                          List<String> aVALABILITY) {
        for (Object unit : depotExpense) {
            for (int i = 0; i < aVALABILITY.size(); i++) {
                if (unit == aVALABILITY.get(i))
                    aVALABILITY.set(i, null);
            }
        }
        System.out.println("the balance in the warehouse");
        System.out.println(aVALABILITY);
        return depotExpense;
    }
}