package com.telran.prof.hometask.depottruck;

import java.util.Scanner;

public class Logistik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do yuo want a order make? Yes - 1   No - 0");
        int chose = sc.nextInt();
        if (chose != 1) {
            System.out.println("By");
            return;
        }
        DepotFirst depotGeneral = new DepotFirst();
        depotGeneral.depotsGoods();

        DepotSecond factory = new DepotSecond();

        OrderMaker order = new OrderMaker();
        order.goodsOrderMaker(depotGeneral.getaVALABILITY());
        DepotWheelGiant giantTruck = new DepotWheelGiant();
        DepotWheelBig bigTruck = new DepotWheelBig();
        DepotWheelMiddle middleTruck = new DepotWheelMiddle();
        DepotWheelSmall smallTruck = new DepotWheelSmall();

        int k = order.getOrderNew().size();
        //  Truck selection
        while (k >= 1) {
            int m = (k >= giantTruck.unitsofCapacity) ? 1 :
                    (k >= bigTruck.unitsOfCapacity) ? 2 :
                            (k >= middleTruck.unitsOfCapacity) ? 3 : 4;
            //System.out.println("chose    " + m);
            switch (m) {
                case 1:
                    giantTruck.ExpenseIncome(order.orderNew, giantTruck.unitsofCapacity);
                    factory.depotExpenseFirst(giantTruck.capacity, depotGeneral.aVALABILITY);
                    factory.depotIncomFirst(giantTruck.capacity,
                            depotGeneral.aVALABILITY);
                    break;

                case 2:
                    bigTruck.ExpenseIncome(order.orderNew, bigTruck.unitsOfCapacity);
                    factory.depotExpenseFirst(bigTruck.capacity, depotGeneral.aVALABILITY);
                    factory.depotIncomFirst(bigTruck.capacity, depotGeneral.aVALABILITY);
                    System.out.println(factory.depotIncom);
                    break;
                case 3:
                    middleTruck.ExpenseIncome(order.orderNew, middleTruck.unitsOfCapacity);
                    factory.depotExpenseFirst(middleTruck.capacity, depotGeneral.aVALABILITY);
                    factory.depotIncomFirst(middleTruck.capacity,
                            depotGeneral.aVALABILITY);
                    break;

                case 4:

                    smallTruck.ExpenseIncome(order.orderNew, smallTruck.unitsOfCapacity);
                    factory.depotExpenseFirst(smallTruck.capacity, depotGeneral.aVALABILITY);
                    factory.depotIncomFirst(smallTruck.capacity,
                            depotGeneral.aVALABILITY);
                    break;
                default:
                    System.out.println("goodby");
            }
            System.out.println("giantTruck            " + giantTruck.capacity);
            System.out.println("bigTruck              " + bigTruck.capacity);
            System.out.println("middleTruck           " + middleTruck.capacity);
            System.out.println("smallTruck            " + smallTruck.capacity);
            System.out.println("factory.depotIncom    " + factory.depotIncom);
            System.out.println("depotGeneral          " + depotGeneral.depotExpense);
            giantTruck.capacity.clear();
            bigTruck.capacity.clear();
            middleTruck.capacity.clear();
            smallTruck.capacity.clear();
            k = order.orderNew.size();
        }
        System.out.println("Order completed    ");
    }
}
