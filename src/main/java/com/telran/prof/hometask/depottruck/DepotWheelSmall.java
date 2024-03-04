package com.telran.prof.hometask.depottruck;

import java.util.ArrayList;

public class DepotWheelSmall extends MainAbstTruck {
    public int unitsOfCapacity = 1;

    public DepotWheelSmall() {
        this.unitsOfCapacity = unitsOfCapacity;
    }

    @Override
    public ArrayList<String> ExpenseIncome(ArrayList<String> income, int unitsOfCapacity) {

        return super.ExpenseIncome(income, this.unitsOfCapacity);
    }
}
