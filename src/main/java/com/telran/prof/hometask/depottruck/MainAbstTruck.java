package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;

public abstract class MainAbstTruck {

    ArrayList<String> capacity = new ArrayList<>();

    public ArrayList<String> getCapacity() {
        return capacity;
    }

    public ArrayList<String> ExpenseIncome(ArrayList<String> income, int unitsOfCapacity) {

        if (unitsOfCapacity == income.size()) {
            capacity.addAll(0, income);

            income.clear();

        } else {
            for (int j = 0; j < unitsOfCapacity; j++) {
                capacity.add(income.get(j));
            }
        }
        for (int j = 0; j < unitsOfCapacity; j++) {
            income.remove(capacity.get(j));
        }

        return capacity;
    }

}
