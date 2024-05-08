package com.telran.prof.hometask.inOutPut15042024.simpleVasyuki;

import java.util.Iterator;
import java.util.Objects;

public class CityVasyuki {

    private String name;

    public CityVasyuki(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CityVasyuki{" +
                "name='" + name + '\'' +
                '}';
    }


}
