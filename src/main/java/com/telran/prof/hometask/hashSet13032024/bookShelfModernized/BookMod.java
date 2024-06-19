package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import com.telran.prof.hometask.hashSet13032024.bookShelf.Author;

public class BookMod {

    public String title;
    public int yearOfPublish;
public int getNumberOfPages;
public AuthorMod authorMod;

    public BookMod(String title, int yearOfPublish, int getNumberOfPages,
                   AuthorMod author) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.getNumberOfPages = getNumberOfPages;
        this.authorMod = authorMod;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getGetNumberOfPages() {
        return getNumberOfPages;
    }

    public void setGetNumberOfPages(int getNumberOfPages) {
        this.getNumberOfPages = getNumberOfPages;
    }

    public AuthorMod getAuthor() {
        return authorMod;
    }

    public void setAuthor(Author author) {
        this.authorMod = authorMod;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", getNumberOfPages=" + getNumberOfPages +
                ", author=" + authorMod +
                '}';
    }
}
