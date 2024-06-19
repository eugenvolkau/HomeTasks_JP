package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Comparator;

public class SortByYearOfPublish implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYearOfPublish() - o2.getYearOfPublish();
    }
}
