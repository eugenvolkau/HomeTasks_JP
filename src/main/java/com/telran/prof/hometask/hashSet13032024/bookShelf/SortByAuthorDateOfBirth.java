package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Comparator;

public class SortByAuthorDateOfBirth implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}
