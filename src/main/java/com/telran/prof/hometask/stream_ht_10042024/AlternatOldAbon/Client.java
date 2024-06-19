package com.telran.prof.hometask.stream_ht_10042024.AlternatOldAbon;

import java.util.List;

public class Client {

    private int iD;
    private String name;
    private int age;
    private List<Phone> phones;

    public Client(int iD, String name, int age, List<Phone> phones) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Client{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phones=" + phones +
                '}';
    }
}
