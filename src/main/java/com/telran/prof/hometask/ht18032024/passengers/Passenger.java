package com.telran.prof.hometask.ht18032024.passengers;

public class Passenger {

    private int classOfService;
    public String surname;

    public Passenger(int classOfService, String surname) {
        this.classOfService = classOfService;
        this.surname = surname;
    }

    public int getClassOfService() {
        return classOfService;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "classOfService=" + classOfService +
                ", surname='" + surname + '\'' +
                '}' + "\n";
    }
}

//Имеется очередь пассажиров(класс Passenger), часть из которых является клиентами
// 1 ого класса, которые должны идти на посадку первыми.
//Написать приложение, которое создаст 10 пассажиров, из них 3 пассажира 1 ого класса.
//Отправить всех в одну очередь, разбирать очередь пока она не станет пустая.
//Пассажиры 1 ого класса должны быть в очереди первыми.