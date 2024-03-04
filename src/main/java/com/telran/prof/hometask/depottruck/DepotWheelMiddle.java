package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;

public class DepotWheelMiddle extends MainAbstTruck {
    public int unitsOfCapacity = 3;

    public DepotWheelMiddle() {
        this.unitsOfCapacity = unitsOfCapacity;
    }

    @Override
    public ArrayList<String> ExpenseIncome(ArrayList<String> income, int unitsOfCapacity) {
        return super.ExpenseIncome(income, unitsOfCapacity);
    }
}
