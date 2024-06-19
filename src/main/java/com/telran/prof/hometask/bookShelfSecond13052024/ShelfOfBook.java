//package com.telran.prof.hometask.bookShelfSecond13052024;
//
//import com.telran.prof.hometask.testStudent15052024.Student;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.ToString;
//
//import java.util.*;
//
//@Getter
//@AllArgsConstructor
//@ToString
//public class ShelfOfBook {
//
//    private Map<Integer, Book> bookDepot;
//    private int maxSize = 10;
//
//    public ShelfOfBook() {
//        bookDepot = new HashMap<>();
//    }
//    public int numberScan() {
//
//        Scanner sc = new Scanner(System.in);
//
//        if (!sc.hasNextInt())
//            return numberScan();
//        int chose = sc.nextInt();
//
//        return chose;
//    }
//    public void bookToShelf(int bookIndex, List<Book> list) {
//
//        if (getBookDepot().size()==maxSize){
//            throw new ExceedCollectCapacity("reached capacity " +
//                    "limit of the bookShelf " + getBookDepot().size());
//        }
//        Optional book = list.stream()
//                .filter(s -> s.getId() == bookIndex)
//                .findFirst();
//       Book newBook = (Book) book.get();
//        System.out.println("Put at Shelf  " + newBook);
//        getBookDepot().put(bookIndex,newBook);
//    }
//    public void bookIssuance(int bookIndex, Map<Integer, Book> situation) {
//
//        if (!getBookDepot().containsKey(bookIndex)){
//            throw new NotFoundBookId("This book number" + bookIndex + " is " +
//                    "not on the shelf ");
//        }
//        situation.keySet().stream()
//                    .map(situation::get)
//                    .forEach(System.out::println);
//
//        situation.entrySet().removeIf(entry -> entry.getKey().equals(bookIndex));
//
//    }
//}



