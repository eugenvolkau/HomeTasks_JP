package com.telran.prof.hometask.stream_ht_10042024.oldestClient;

import java.util.*;

public class Client {
    private String iD;
    private String name;
    private int age;
    private Map<Integer,NofeletTyp> phones;

    public Client(String iD, String name, int age) {
        this.iD = iD;
        this.name = name;
        this.age = age;
    }

    public void addPhone(Integer phone, NofeletTyp type) {
        if (this.phones == null) {
            this.phones = new HashMap<>();
        }
        this.phones.put(phone, type);
    }

                public Nofelet set(int index, Nofelet element) {
                    return null;
                }

    public Client(Nofelet nofelet) {
        this.phones = phones;
    }

    public Map<Integer, NofeletTyp> getPhones() {
        return phones;
    }

    public String getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<Integer, NofeletTyp> getPhone() {
        return phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Client{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nofelet=" + phones +
                '}';
    }
}
//    Есть класс клиент, со следующими полями: уникальный идентификатор, имя, возраст.
//     Дополнительно, у клиента есть поле - список телефонов.
//     Класс телефона содержит само значение и тип (стационарный или мобильный).
//     Вывести в консоль самого взрослого клиента, который использует
//     cтационарный телефон.
//     Задачу решить с использованием Stream API.