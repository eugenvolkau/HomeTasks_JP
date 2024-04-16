package com.telran.prof.hometask.hashSet13032024.autoShop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarMonitoring {

    public static void main(String[] args) {

        CarsSold car1 = new CarsSold(CarMark.TRABANT, CarColor.ROSE,
                "TRabant1990", "SHG541SK");
        CarsSold car2 = new CarsSold(CarMark.GAZ, CarColor.GRAYMETALLIC,
                "GAZ1955", "H-TS3512");
        CarsSold car3 = new CarsSold(CarMark.TRABANT, CarColor.ROSE,
                "trabant232323", "SDR-456F");
        CarsSold car4 = new CarsSold(CarMark.WARTBURG, CarColor.KHAKI,
                "Wart666666", "BRL98S");
        CarsSold car5 = new CarsSold(CarMark.WARTBURG, CarColor.GRAYMETALLIC,
                "PACK3333333", "MU-322JT");
        CarsSold car6 = new CarsSold(CarMark.GAZ, CarColor.KHAKI, "Gaz666777",
                "MIC2245");

        Set<CarsSold> carsLandLeas = new HashSet<CarsSold>();
        carsLandLeas.add(car1);
        carsLandLeas.add(car2);
        carsLandLeas.add(car6);
        carsLandLeas.add(car4);
        //cars.remove(car1);

        System.out.println("Soldet cars  as of 20 years ago  :  \n");
        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 +
                "\n" + car5 + "\n" + car6 + "\n");

        System.out.println("car1 & car2 cars were repainted and registration plates were changed");
        car1.setColor(CarColor.RED);
        car1.setRegistrNumber("JK999S");
        car2.setColor(CarColor.VIOLET);
       car2.setRegistrNumber("CHS1910");

        System.out.println("Soldet cars  as of today  :  \n");
        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 +
                "\n" + car5 + "\n" + car6 + "\n");

        System.out.println("CarLandLeas contain car1 " + carsLandLeas.contains(car1));
        System.out.println("CarLandLeas contain car2 " + carsLandLeas.contains(car2));
        System.out.println("CarLandLeas contain car3 " + carsLandLeas.contains(car3));
        System.out.println("CarLandLeas contain car4 " + carsLandLeas.contains(car4));
        System.out.println("CarLandLeas contain car5 " + carsLandLeas.contains(car5));
        System.out.println("CarLandLeas contain car6 " + carsLandLeas.contains(car6));

        System.out.println("LandLeas   :");
        System.out.println(carsLandLeas);


    }

}
