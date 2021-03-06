package booksmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import books.AudioBook;
import books.Book;
import books.PaperbackBook;
import people.Author;

public class Main {
  public static void main(String[] args) {
    //Polymorhism. Reference type is parent, Object is child type
//    Book audibleBook = new AudioBook("Twisted Prey", "Thriller", 
//        new Author("John Sandford"), 28.0, 4, 689);
//    
//    System.out.println(audibleBook.toString());
//    
//    //print out length of this book -> Twisted Prey
//    //DownCasting FROM BOOK reference to AUDIOBOOK reference.
//    //((AudioBook)audibleBook).getLength(); // AudioBook audibleBook = new AudioBook(....)
//    
//    System.out.println(((AudioBook)audibleBook).getLength());
//    
//    //I want a list that can store any kind of book.
//    List<Book> booksList = new ArrayList<>();
//    
//    booksList.add(new PaperbackBook("Adult Camp","Comedy",new Author("Persis Orts"),  54,  8,  39));
//    booksList.add(new AudioBook("Mr. Turner","Drama",new Author("Garfield Duinkerk")  ,45,  1,112));
//    
//    
//    for(Book book : booksList) {
//      //I want to know if it is a paperback or audio book?
//      
////      if(book instanceof PaperbackBook) {
////        System.out.println("PaperbackBook");
////      }else if(book instanceof AudioBook) {
////        System.out.println("AudioBook");
////      }
//      System.out.println(book.getClass().getSimpleName());
//      System.out.println(book.getClass().getName());
//      
//      System.out.println(book.toString());
//    }
//      
//    System.out.println(booksList.toString());
//    
//    List<Book> booksFromFile = new ArrayList<>();
//    
//    BooksController.loadBooks("BooksData.csv", booksFromFile);
//    
//    System.out.println("Number of Books:" + booksFromFile.size());
//    //
//    
////    for (Book book : booksFromFile) {
////      System.out.println(book.toString());
////    }
//    
//    String str1 = "A";
//    String str2 = "B";
//    String str3 = "C";
//    
//    List<String> strs = new ArrayList<>();
//    strs.add(str3);
//    strs.add(str2);
//    strs.add(str1);
//    
//    System.out.println(strs.toString());
//    Collections.sort(strs);
//    
//    System.out.println(strs.toString());
//    
//    System.out.println(str3.compareTo(str3));
//    
//    Collections.sort(booksFromFile);
//    
//    for (Book book : booksFromFile) {
//      System.out.println(book.toString());
//    }
//    //==============================
//    
//    Book book1 = new PaperbackBook("Adult Camp","Comedy",new Author("Persis Orts"),  54,  8,  39);
//    Book book2 = new AudioBook("Mr. Turner","Drama",new Author("Garfield Duinkerk")  ,45,  1,112);
//    
//    System.out.println(book1.compareTo(book2)); //negative number
//    System.out.println(book2.compareTo(book1)); //positive
//    
//    book1.setTitle(book2.getTitle());
//    
//    System.out.println(book1.compareTo(book2));//0
//    
    
    BooksController controller = new BooksController();
    
    controller.addReader("Dean Lee", "LIMITED");
    controller.addReader("Montpensier", "UNLIMITED");
    controller.addReader("Romeo", "UNLIMITED");
    controller.addReader("Myrna", "LIMITED");
    
    System.out.println(controller.readersList);
    
//    controller.addBook("AudioBook","Last Command","Drama|War","Aveline Hailwood"  , "44",  "9","11");
//    controller.addBook("AudioBook","First Command","Drama|Peace","Aveline Hollywood"  , "45",  "9","11");
//    
    System.out.println(controller.getBooksInformation());
    
  }
  
  
  
}


// Shared via @Webclipse. To open this file type:
// /code-open Main.java 1-124 KOkAIg