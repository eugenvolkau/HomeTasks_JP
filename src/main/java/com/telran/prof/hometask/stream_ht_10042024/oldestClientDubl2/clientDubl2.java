package com.telran.prof.hometask.stream_ht_10042024.oldestClientDubl2;

import java.util.*;

public class clientDubl2 {

        private int iD;
        private String name;
        private int age;
        private List<NofeletDubl2> phones;

        public clientDubl2(int iD, String name, int age) {
            this.iD = iD;
            this.name = name;
            this.age = age;
        }

    public void addPhone(NofeletDubl2 phone) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phone);
    }
        public int getiD() {
            return iD;
        }

        public String getName() {
            return name;
        }

        public void setiD(int iD) {
            this.iD = iD;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public void setPhones(List<NofeletDubl2> phones) {
        this.phones = phones;
    }

    public NofeletDubl2 getPhones() {
            return (NofeletDubl2) phones;
        }

        public void setPhones (NofeletDubl2 phones) {
            this.phones = (List<NofeletDubl2>) phones;
        }

        public int getAge() {
            return age;
        }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        clientDubl2 that = (clientDubl2) o;
//        return age == that.age;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age);
//    }

    @Override
    public String toString() {
        return "Client2{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phones +
                '}';
    }

    public void setPhone(Integer num, NofeletTypeDubl2 nofeletTypeDubl2) {
    }

}


//    Есть класс клиент, со следующими полями: уникальный идентификатор, имя, возраст.
//     Дополнительно, у клиента есть поле - список телефонов.
//     Класс телефона содержит само значение и тип (стационарный или мобильный).
//     Вывести в консоль самого взрослого клиента, который использует
//     cтационарный телефон.
//     Задачу решить с использованием Stream API.

