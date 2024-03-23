package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Bookshelf> {
    @Override
    public int compare(Bookshelf o1, Bookshelf o2) {
        return o1.getBookTitle().compareTo(o2.getBookTitle());
    }
}
