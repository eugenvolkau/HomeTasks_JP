package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Comparator;

public class SortByTitle implements Comparator<Books> {

    @Override
    public int compare(Books o1, Books o2) {
        return o1.getBookTitle().compareTo(o2.getBookTitle());
    }
}