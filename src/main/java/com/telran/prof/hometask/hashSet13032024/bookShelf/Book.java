package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.Objects;

public class Book {

    private String bookTitle;
    private int yearOfPublish;
    private int numberOfPages;
    private Author author;

    Book(String bookTitle, int yearOfPublish, int numberOfPages,
         Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublish = yearOfPublish;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublish == book.yearOfPublish && numberOfPages == book.numberOfPages && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearOfPublish, numberOfPages, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", numberOfPages=" + numberOfPages +
                ", authorName= " + author.getName() +
                "authorBirthYear= " + author.getYearOfBirth() + '}' + "\n"
                ;
    }
}

// 1) Книжная полка :
//Есть объект книжная полка , есть объекты книги(10 штук), которые хранятся на
// этой книжной полке. Книга должна иметь следующие поля : Название, год
// издания,количество страниц, Автор.

//Автор должен иметь поля, имя, год рождения.
//
//Вывести в консоль содержимое книжной полки в оригинальном виде.
//Запросить с консоли варианты сортировки :
//    1-По названию,2-По году издания, 3-По количеству страниц, 4-По году
//    рождения автора. В зависимости от введенного варианта , отсортировать
//    книги на книжной полке.
//(Должно быть создано 4 варианта компараторов для сортировки)