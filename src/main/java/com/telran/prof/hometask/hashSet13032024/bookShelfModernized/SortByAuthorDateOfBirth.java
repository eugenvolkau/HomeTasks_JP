package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import com.telran.prof.hometask.hashSet13032024.bookShelf.Author;

import java.util.Comparator;

public class SortByAuthorDateOfBirth implements Comparator<AuthorMod> {

    @Override
    public int compare(AuthorMod o1, AuthorMod o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }


}
