package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;

public class DepotWheelBig extends MainAbstTruck {

    public int unitsOfCapacity = 5;

    public ArrayList<String> getCapacity() {
        return capacity;
    }

    public DepotWheelBig() {
        this.unitsOfCapacity = unitsOfCapacity;
    }

    @Override
    public ArrayList<String> ExpenseIncome(ArrayList<String> income, int unitsOfCapacity) {
        return super.ExpenseIncome(income, this.unitsOfCapacity);
    }
}

