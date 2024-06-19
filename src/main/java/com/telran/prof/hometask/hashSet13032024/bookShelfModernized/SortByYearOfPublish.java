package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class SortByYearOfPublish implements Comparator<BookMod> {

    @Override
    public int compare(BookMod o1, BookMod o2) {
        return o1.getYearOfPublish() - o2.getYearOfPublish();
    }
}
