package com.telran.prof.hometask.hashSet13032024.bookShelfModernized;

import java.util.*;

public class BookInspectMod {

    public static void main(String[] args) {

        AuthorMod authoOne = new AuthorMod("Marx", 1818);
        AuthorMod authoTwo = new AuthorMod("Rodari", 1920);
        AuthorMod authoThree = new AuthorMod("Shaherezada", 1440);
        AuthorMod authoFour = new AuthorMod("Remarque", 1898);
        AuthorMod authoFive = new AuthorMod("Saint-Exupery", 1900);
        AuthorMod authoSix = new AuthorMod("Bulgakov", 1891);
        AuthorMod authoSeven = new AuthorMod("Shakespear", 1564);
        AuthorMod authoEight = new AuthorMod("Homer", -750);
        AuthorMod authoNine = new AuthorMod("Goethe", 1782);
        AuthorMod authoten = new AuthorMod("Ilf&Petrov", 1898);
        List<BookMod> books = Arrays.asList(
                new BookMod("Capital", 1867, 543, authoOne),
                new BookMod("Chipolino", 1958, 543, authoTwo),
                new BookMod("Thousand and One Nights", 1843, 452,
                        authoThree),
                new BookMod("Three Comrades", 1936, 45, authoFour),
                new BookMod("The Little Prince", 1943, 68, authoFive),
                new BookMod("Dog's heart", 1925, 125, authoSix),
                new BookMod("Hamlet", 1601, 95, authoSeven),
                new BookMod("The Iliad", -700, 208, authoEight),
                new BookMod("Faust", 1808, 216, authoNine),
                new BookMod("the twelve Chair", 1928, 179, authoten));

        System.out.println("What will we look for?");

        System.out.println("Title                        ->  1");
        System.out.println("Year of publishing           ->  2");
        System.out.println("numberOfPages                ->  3");
        System.out.println("Author                       ->  4");

        Scanner sc = new Scanner(System.in);
        int sortField = sc.nextInt();
        switch (sortField) {

            case 1:
               SortTitle sortTitle = new SortTitle();
//
//                Set<BookMod> bookshelfSet = new TreeSet<BookMod>();
//                bookshelfSet.addAll(books);
//
//                System.out.println("TreeSet : \n" + bookshelfSet);

                Collections.sort(books, sortTitle);
                System.out.println("\n Collections.sort By Title : \n" + books);
                break;

//            case 2:
//                SortByYearOfPublish sortByYearOfPublish = new SortByYearOfPublish();
//                Collections.sort(books, sortByYearOfPublish(books,));
//                System.out.println(" After sort  By Year Of Pubish : " + books);
//                break;
//            case 3:
//                SortNumberPages sortByNumberOfPages = new SortNumberPages();
//                Collections.sort(BookMod, sortByNumberOfPages);
//                System.out.println(" After sort By Number Of Pages : " + books);
//                break;
//
//            case 4:
//                SortByTitle sortByTitle = new SortByTitle();
//
//                Set<BookMod> bookshelfSet = new TreeSet<>(sortByTitle);
//                for (BookMod unit : books) {
//                    bookshelfSet.add(unit);
//                }
//                System.out.println("TreeSet : \n" + bookshelfSet);
//
//                Collections.sort(books, sortByTitle);
//                break;
            default:
                System.out.println("Basil! There are no such fields");
        }
    }

}

