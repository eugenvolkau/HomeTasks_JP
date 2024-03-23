package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.*;

public class BookInspect {

    public static void main(String[] args) {
        Author authoOne = new Author("Marx", 1818);
        Author authoTwo = new Author("Rodari", 1920);
        Author authoThree = new Author("Shaherezada", 1440);
        Author authoFour = new Author("Remarque", 1898);
        Author authoFive = new Author("Saint-Exupery", 1900);
        Author authoSix = new Author("Bulgakov", 1891);
        Author authoSeven = new Author("Shakespear", 1564);
        Author authoEight = new Author("Homer", -750);
        Author authoNine = new Author("Goethe", 1782);
        Author authoten = new Author("Ilf&Petrov", 1898);
        List<Bookshelf> books = Arrays.asList(
                new Bookshelf("Capital", 1867, 543, authoOne),
                new Bookshelf("Chipolino", 1958, 543, authoTwo),
                new Bookshelf("Thousand and One Nights", 1843, 452,
                        authoThree),
                new Bookshelf("Three Comrades", 1936, 45, authoFour),
                new Bookshelf("The Little Prince", 1943, 68, authoFive),
                new Bookshelf("dog's heart", 1925, 125, authoSix),
                new Bookshelf("Hamlet", 1601, 95, authoSeven),
                new Bookshelf("The Iliad", -700, 208, authoEight),
                new Bookshelf("Faust", 1808, 216, authoNine),
                new Bookshelf("the twelve Chair", 1928, 179, authoten));

        System.out.println("What will we look for?");

        System.out.println("Title                        ->  1");
        System.out.println("Year of publishing           ->  2");
        System.out.println("Year of publishing           ->  3");
        System.out.println("Author                       ->  4");

        Scanner sc = new Scanner(System.in);
        int sortField = sc.nextInt();
        switch (sortField) {

            case 1:
                SortByTitle sortByTitle = new SortByTitle();

                Set<Bookshelf> bookshelfSet = new TreeSet<>(sortByTitle);
                for (Bookshelf unit : books) {
                    bookshelfSet.add(unit);
                }
                System.out.println("TreeSet : \n" + bookshelfSet);

                Collections.sort(books, sortByTitle);
                System.out.println("\n Collections.sort  : \n" + books);
                break;

            case 2:
                SortByYearOfPubish sortByYearOfPubish = new SortByYearOfPubish();
                Collections.sort(books, sortByYearOfPubish);
                System.out.println(" After sort by Year Cars  : " + books);
                break;
            case 3:
                SortByNumberOfPages sortByNumberOfPages = new SortByNumberOfPages();
                Collections.sort(books, sortByNumberOfPages);
                System.out.println(" After sort by Year Cars  : " + books);
                break;

            case 4:
                SortByAuthor sortByAuthor = new SortByAuthor();
                Collections.sort(books, sortByAuthor);
                System.out.println(" After sort by Year Cars  : " + books);
            default:
                System.out.println("Basil! There are no such fields");
        }
    }
}

