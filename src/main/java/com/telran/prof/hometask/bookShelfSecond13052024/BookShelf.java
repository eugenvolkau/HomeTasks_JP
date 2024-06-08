package com.telran.prof.hometask.bookShelfSecond13052024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class BookShelf {

    public static void main(String[] args) {

        final int sizeOfShelf = 10;

        ShelfOfBook shelf = new ShelfOfBook();

        Book book = new Book();

        List<Book> bookReserv = Arrays.asList(
                new Book(1, "Capital ", 1867, 543, new Author("Marks", 1818)),
                new Book(2, "Chipolino ", 1958, 543, new Author(" Rodari ",
                        1920)),
                new Book(3, "Thousand and One Nights ", 1843, 452,
                        new Author(" Shaherezada ", 1440)),
                new Book(4, "Three Comrades ", 1936, 45, new Author(" Remarque ", 1898)),
                new Book(5, "The Little Prince ", 1943, 68, new Author(" Saint-Exupery ", 1900)),
                new Book(6, "Dog's heart ", 1925, 125, new Author(" Bulgakov ", 1891)),
                new Book(7, "Hamlet ", 1601, 95, new Author(" Shakespear ", 1564)),
                new Book(8, "The Iliad ", -700, 208, new Author(" Homer ", -750)),
                new Book(9, "Faust ", 1808, 216, new Author(" Goethe ", 1782)),
                new Book(10, "Golden calf ", 1928, 179, new Author("Ilf&Petrov ", 1898)),
                new Book(11, "Little Red Riding Hood", 1662, 5, new Author("Perrault",
                        1657)),
                new Book(12, "Puss in Boots", 1664, 9, new Author("Perrault", 1627))

        );

        int scenario = 15;
        while (scenario != 0) {

            System.out.println("Current situation on the bookshelf -> " + shelf.getBookDepot().size() + " books");
            shelf.getBookDepot().keySet().stream()
                    .map(shelf.getBookDepot()::get)
                    .forEach(System.out::println);

            System.out.println("What do we do?  ");
            System.out.println("Let's remove all the books from the shelf  ->  1");
            System.out.println("Put a book on the shelf                    ->  2");
            System.out.println("Let's remove a book from the shelf         ->  3");
            System.out.println("Close the reading room ->  0");

            scenario = shelf.numberScan();

            switch (scenario) {
                case 1:
                    shelf.getBookDepot().clear();
//                    for (int i = 0; i < (bookDepot.size() + 1); i++) {
//                        shelf.bookIssuance(i, bookDepot);
//                    }
                    break;
                case 2:
                    bookReserv.forEach(book1 -> {
                        System.out.println(book1);
                    });
                    System.out.println("indicate the book ID");
                    int numberOfBookTo = shelf.numberScan();
                    shelf.bookToShelf(numberOfBookTo, bookReserv);
                    break;
                case 3:
                    System.out.println("indicate the book ID");
                    int numberOfBookOut = shelf.numberScan();
                    shelf.bookIssuance(numberOfBookOut, shelf.getBookDepot());
                    break;
                case 4:
                    scenario = 0;
            }

        }
    }
}