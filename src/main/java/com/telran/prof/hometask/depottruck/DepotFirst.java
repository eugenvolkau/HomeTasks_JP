package com.telran.prof.hometask.depottruck;

import java.util.List;

public class DepotFirst extends Depots {

    @Override
    public void depotsGoods() {
        super.depotsGoods();
        }

    @Override
    public List<String> depotIncomFirst(List<String> depotIncom, List<String> capacityAll) {
        super.depotIncomFirst(depotIncom, capacityAll);
        System.out.println("DepotFirst" + depotIncom);
        return depotIncom;
    }
    @Override
    public List<String> depotExpenseFirst(List<String> depotExpense, List<String> aVailability) {
        super.depotExpenseFirst(depotExpense, aVailability);
        System.out.println("depotGeneral" + depotExpense);
        return depotExpense;
    }
}

