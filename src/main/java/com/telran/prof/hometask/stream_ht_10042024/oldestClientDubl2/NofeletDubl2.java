package com.telran.prof.hometask.stream_ht_10042024.oldestClientDubl2;

import java.util.Objects;

public class NofeletDubl2 {

    private int phoneNumber;

    private Enum<NofeletTypeDubl2> phoneType;

    public NofeletDubl2(int phoneNumber, Enum phoneType) {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    private int getPhoneNumber() {
        return phoneNumber;
    }

    private Enum<NofeletTypeDubl2> getPhoneType() {
        return phoneType;
    }

    private void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private void setPhoneType(Enum<NofeletTypeDubl2> phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NofeletDubl2 that = (NofeletDubl2) o;
        return Objects.equals(phoneType, that.phoneType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneType);
    }

    @Override
    public String toString() {
        return "NofeletDubl2{" +
                "phoneNumber=" + phoneNumber +
                ", phoneType=" + phoneType +
                '}';
    }
}
