package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import java.util.Comparator;

public class SortTitle implements Comparator<BookMod> {

   @Override
    public int compare(BookMod o1, BookMod o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
