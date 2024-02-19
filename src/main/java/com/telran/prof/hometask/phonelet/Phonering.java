package com.telran.prof.hometask.phonelet;

public class Phonering {

    public static void main(String[] args) {

        Phone phone1 = new Phone(123456789, "Salute+ ", 123);

        phone1.setName("Nafusail");

        Phone phone2 = new Phone(234567891, "Enigma+ ", 560);

        phone2.setName("Gerodot");

        Phone phone3 = new Phone(345678912, "Edisson+ ", 340);

        phone3.setName("Thatcher");


        phone1.receiveCall();
        System.out.println("Number   " + phone1.getNumber() + " Model " + phone1.getModel() + "    " +
                "Weight  " + phone1.getWeight());
        phone2.receiveCall();
        System.out.println("Number   " + phone2.getNumber() + " Model " + phone2.getModel() + "    Weight  " + phone2.getWeight());
        phone3.receiveCall();
        System.out.println("Number   " + phone3.getNumber() + " Model " + phone3.getModel() + "    Weight  " + phone3.getWeight());
    }
}
