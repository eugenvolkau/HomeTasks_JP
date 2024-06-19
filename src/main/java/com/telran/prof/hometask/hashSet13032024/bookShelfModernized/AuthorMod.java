package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import java.util.Objects;

public class AuthorMod {
    private String name;
    private int yearOfBirth;

    public AuthorMod(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorMod authorMod = (AuthorMod) o;
        return yearOfBirth == authorMod.yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth);
    }
}

