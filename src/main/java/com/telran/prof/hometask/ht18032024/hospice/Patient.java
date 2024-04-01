package com.telran.prof.hometask.ht18032024.hospice;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.function.Consumer;

public class Patient extends ArrayDeque<Patient> {
    private String name;
    private String surname;
    private int condition;
    private Phase location;

    public Patient(String name, String surname, int condition, Phase location) {
        this.name = name;
        this.surname = surname;
        this.condition = condition;
        this.location = location;
    }

    public int getCondition() {
        return condition;
    }

    public Phase getLocation() {
        return location;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public Consumer<? super Patient> setLocation(Phase location) {
        this.location = location;
        return null;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Patient patient = (Patient) object;
        return condition == patient.condition;
    }
    @Override
    public String toString() {
        return "\nPatient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", condition=" + condition +
                ", location=" + location +
                '}';
    }
}
