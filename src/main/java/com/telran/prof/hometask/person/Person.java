package com.telran.prof.hometask.person;
public class Person {
    private String name;
    private String fullName;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person() {
    }
    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void move(String fullName){
        System.out.println(fullName + " is coming");
    }
    public void talk(String fullName){
        System.out.println(fullName + " is saying");
    }

}
