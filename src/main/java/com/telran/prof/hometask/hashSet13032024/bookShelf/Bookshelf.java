package com.telran.prof.hometask.hashSet13032024.bookShelf;

public class Bookshelf {

    public String bookTitle;
    public int yearOfPublish;
    public int numberOfPages;
    public Author autor;

    public Bookshelf(String bookTitle, int yearOfPublish, int numberOfPages,
                     Author autor) {
        this.bookTitle = bookTitle;
        this.yearOfPublish = yearOfPublish;
        this.numberOfPages = numberOfPages;
        this.autor = autor;
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

    @Override
    public String toString() {
        return "\n Bookshelf\n{" +
                "bookTitle='" + bookTitle + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", numberOfPages=" + numberOfPages +
                '}';
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