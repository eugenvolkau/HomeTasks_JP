package com.telran.prof.hometask.phonelet;

public class Phone {
    private long number;
    private String model;
    private float weight;
    private String name;
    public Phone() {
    }
    public Phone(long number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public float getWeight() {
        return weight;
    }
    public void receiveCall() {
        System.out.println(name + " is calling " + number);
    }

}
