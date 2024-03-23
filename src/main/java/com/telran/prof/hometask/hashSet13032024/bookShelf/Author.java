package com.telran.prof.hometask.hashSet13032024.bookShelf;

public class Author {
    public String name;
    private int yearOfBirth;

    public Author(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Author)) return false;
        Author Author = (Author) obj;
        return this.name.equals(Author.name) && this.yearOfBirth == Author.yearOfBirth;
    }
}

