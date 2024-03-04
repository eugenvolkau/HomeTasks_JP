package com.telran.prof.hometask.depottruck;

import java.util.List;

public class DepotSecond extends Depots {

    @Override
    public void depotsGoods() {
        super.depotsGoods();
    }

    @Override
    public List<String> depotIncomFirst(List<String> depotIncom, List<String> capacityAll) {
        return super.depotIncomFirst(depotIncom, capacityAll);
    }

    @Override
    public List<String> getDepotExpense() {
        return super.getDepotExpense();
    }
}
//    System.out.println("Strict delivery schedule. Please follow!   ");
//        System.out.println(" ");
//       System.out.println("The Truck with a lifting capacity of ton was " + depotIncom.size() +
//                       "tons shipped");

//    @Override
//    public void depotExpense(List<String> depotExpense, List<String> aVailability) {
//        super.depotExpense(depotExpense, aVailability);
//
//        System.out.println(" ");
//    }