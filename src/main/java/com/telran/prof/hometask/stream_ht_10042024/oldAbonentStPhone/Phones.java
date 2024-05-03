package com.telran.prof.hometask.stream_ht_10042024.oldAbonentStPhone;

import java.util.Objects;

public class Phones {


    private int phone;
    private Enum<PhoneType> phoneType;

    public Phones(int phone, PhoneType phoneTyp) {
this.phone=phone;
this.phoneType=phoneTyp;
    }

    public Enum<PhoneType> getPhoneType() {
        return phoneType;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "phone=" + phone +
                ", phoneType=" + phoneType +
                '}';
    }
}


