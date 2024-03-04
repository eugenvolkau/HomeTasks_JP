package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;

public class DepotWheelGiant extends MainAbstTruck {
    public int unitsofCapacity = 10;

    public ArrayList<String> getCapacity() {
        return this.capacity;
    }

    public DepotWheelGiant() {
        this.unitsofCapacity = unitsofCapacity;
    }

    @Override
    public ArrayList<String> ExpenseIncome(ArrayList<String> income, int unitsOfCapacity) {
        return super.ExpenseIncome(income, this.unitsofCapacity);
    }
}

