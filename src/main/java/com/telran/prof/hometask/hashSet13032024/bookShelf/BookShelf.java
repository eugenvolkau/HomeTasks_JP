package com.telran.prof.hometask.hashSet13032024.bookShelf;

import java.util.*;

public class BookShelf {

    public static void main(String[] args) {

        int choice;

        String str = null;

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

        List<Book> books = Arrays.asList(
                new Book("Capital", 1867, 543, marks),
                new Book("Chipolino", 1958, 543, rodari),
                new Book("Thousand and One Nights", 1843, 452,
                        shacherezada),
                new Book("Three Comrades", 1936, 45, remarque),
                new Book("The Little Prince", 1943, 68, exupery),
                new Book("Dog's heart", 1925, 125, bulgakov),
                new Book("Hamlet", 1601, 95, shakespear),
                new Book("The Iliad", -700, 208, homer),
                new Book("Faust", 1808, 216, goethe),
                new Book("Golden calf", 1928, 179, ilfPetrov));

        do {
            System.out.println("What will we look for?");

            System.out.println("Title                        ->  1");
            System.out.println("Year of publishing           ->  2");
            System.out.println("By Number Of Pages           ->  3");
            System.out.println("Authors BirthYear            ->  4");
            System.out.println("Authors Name                 ->  5");
            System.out.println("Exit                         ->  6");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    Collections.sort(books, new SortByTitle());
                    str = "\n Collections.sort By Title : \n";
                    break;
                case 2:
                    Collections.sort(books, new SortByYearOfPublish());
                    str = " After sort  By Year Of Pubish : \n";
                    break;
                case 3:
                    Collections.sort(books, new SortNumberPages());
                    str = " After sort By Number Of Pages :\n";
                    break;
                case 4:
                    Collections.sort(books, new SortAuthorBirthday());
                    str = " After sort By Number Of Pages : \n";
                    break;
                case 5:
                    Collections.sort(books, new SortAuthorName());
                    str = " After sort By Number Of Pages : \n";
                    break;
                default:
                    str = "Come again! These books are waiting for you.";
            }
            System.out.println(str + books);
        } while (choice != 6);
    }
}

