package com.telran.prof.hometask.person;

public class personList {

    public static void main(String[] args) {
        Person writer = new Person();
        writer.setName("Giuseppe");
        writer.setFullName("Verdi");
        writer.setAge(1813);
        System.out.println(writer.getName() + "    " + writer.getFullName() +
                "  was born in " + writer.getAge());

        writer.move(writer.getFullName());
        writer.talk(writer.getFullName());

        Person composer = new Person("Hanz Hristian", "Andersen", 1805);
        System.out.println(composer.getName() + "    " + composer.getFullName() +
                "  was born in  " + composer.getAge());

        composer.move(composer.getFullName());
        composer.talk(composer.getFullName());

    }
}
