package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import java.util.ArrayList;
import java.util.List;

public class Abonents {

    private int id;
    private String name;
    private int age;
    private Integer phones;
    private List<Phones> phonesOfAbonents;


    public Abonents(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Abonents(int id) {
        this.id = id;
        name = name;
        this.age = age;
    }

    public Abonents() {
    }

    public void addPhone(Phones phone) {
        if (this.phonesOfAbonents == null) {
            this.phonesOfAbonents = new ArrayList<Phones>();
        }
        this.phonesOfAbonents.add(phone);
    }

    public Integer getPhones() {
        return phones;
    }

    public List<Phones> getPhonesOfAbonents() {
        return phonesOfAbonents;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Abonents{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", age=" + age +
                ", phonesOfAbonents=" + phonesOfAbonents +
                '}';
    }
}
