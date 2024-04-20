package com.telran.prof.hometask.stream_ht_10042024.carList;

import java.util.Objects;

public class Auto {

    private String registrNumber;
    private Enum carColor;
    private Enum model;
    private int mileage;
    private int price;

    public Auto(String registrNumber, Enum carColor, Enum model, int mileage, int price) {
        this.registrNumber = registrNumber;
        this.carColor = carColor;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public String getRegistrNumber() {
        return registrNumber;
    }

    public Enum getCarColor() {
        return carColor;
    }

    public Enum getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return mileage == auto.mileage && price == auto.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mileage, price);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "registrNumber='" + registrNumber + '\'' +
                ", carColor=" + carColor +
                ", model=" + model +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}

