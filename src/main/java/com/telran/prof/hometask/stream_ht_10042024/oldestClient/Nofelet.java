package com.telran.prof.hometask.stream_ht_10042024.oldestClient;

import java.util.Objects;

public class Nofelet {
    private int phoneNumber;
    private Enum<NofeletTyp> phoneType;

    public Nofelet(int phoneNumber, Enum<NofeletTyp> phoneType) {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public Nofelet(int phoneNumber, NofeletTyp nofeletTyp) {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Enum<NofeletTyp> getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(Enum<NofeletTyp> phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nofelet nofelet = (Nofelet) o;
        return Objects.equals(phoneType, nofelet.phoneType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneType);
    }

    @Override
    public String toString() {
        return "Nofelet{" +
                "phoneNumber=" + phoneNumber +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }
}
