package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Comparator;

public class SortAuthorName implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
    }
}

