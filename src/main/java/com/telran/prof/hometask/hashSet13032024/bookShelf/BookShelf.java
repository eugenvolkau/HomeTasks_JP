package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.*;

public class BookShelf {

    public static void main(String[] args) {
        Author marks = new Author("Marx", 1818);
        Author rodari = new Author("Rodari", 1920);
        Author shacherezada = new Author("Shaherezada", 1440);
        Author remarque = new Author("Remarque", 1898);
        Author exupery = new Author("Saint-Exupery", 1900);
        Author bulgakov = new Author("Bulgakov", 1891);
        Author shakespear = new Author("Shakespear", 1564);
        Author homer = new Author("Homer", -750);
        Author goethe = new Author("Goethe", 1782);
        Author ilfPetrov = new Author("Ilf&Petrov", 1898);
        List<Books> books = Arrays.asList(
                new Books("Capital", 1867, 543, marks),
                new Books("Chipolino", 1958, 543, rodari),
                new Books("Thousand and One Nights", 1843, 452,
                        shacherezada ),
                new Books("Three Comrades", 1936, 45, remarque),
                new Books("The Little Prince", 1943, 68, exupery),
                new Books("Dog's heart", 1925, 125,  bulgakov),
                new Books("Hamlet", 1601, 95, shakespear),
                new Books("The Iliad", -700, 208, homer),
                new Books("Faust", 1808, 216, goethe),
                new Books("the twelve Chair", 1928, 179, ilfPetrov));

        System.out.println("What will we look for?");

        System.out.println("Title                        ->  1");
        System.out.println("Year of publishing           ->  2");
        System.out.println("By Number Of Pages           ->  3");
        System.out.println("Author                       ->  4");

        Scanner sc = new Scanner(System.in);
        int sortField = sc.nextInt();
        switch (sortField) {

            case 1:
                SortByTitle sortByTitle = new SortByTitle();
//
//                Set<Books> bookshelfSet = new TreeSet<>(sortByTitle);
//                for (Books unit : books) {
//                    bookshelfSet.add(unit);
//                }
//                System.out.println("TreeSet : \n" + bookshelfSet);

                Collections.sort(books, sortByTitle);
                System.out.println("\n Collections.sort By Title : \n" + books);
                break;

            case 2:
                SortByYearOfPublish sortByYearOfPublish = new SortByYearOfPublish();
                Collections.sort(books, sortByYearOfPublish);
                System.out.println(" After sort  By Year Of Pubish : " + books);
                break;
            case 3:
                SortByNumberOfPages sortByNumberOfPages = new SortByNumberOfPages();
                Collections.sort(books, sortByNumberOfPages);
                System.out.println(" After sort By Number Of Pages : " + books);
                break;

            case 4:
//                SortByAuthorDateOfBirth sortByAuthor = new SortByAuthorDateOfBirth();
//                Collections.sort(books, new SortByAuthorDateOfBirth());
//                System.out.println(" After sort By Author  : " + books);
                break;
            default:
                System.out.println("Basil! There are no such fields");
        }
    }
}

