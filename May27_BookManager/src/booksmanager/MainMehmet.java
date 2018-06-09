package booksmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import books.Book;

public class MainMehmet {	
	public static void main(String[] args) {
//		List<Book> booksFromFile = new ArrayList<>();
//		BooksController.loadBooks("BooksData.csv", booksFromFile);
//		
//		System.out.println("Number of Books : "+booksFromFile.size());
////		Following commented lines print all the lsit items
////		int i=0;
////		for (Book book : booksFromFile) {
////			System.out.println("#" + ++i +"\t: "+book);
////		}
//		String str1 = "A";
//		String str2 = "B";
//		String str3 = "C";
//		List<String> strs= new ArrayList<>();
//		strs.add(str3);
//		strs.add(str2);
//		strs.add(str1);
//		System.out.println(strs);
//		Collections.sort(strs);
//		System.out.println(strs);
//		
//		System.out.println(str1.compareTo(str2));
//		
//		
//		
//		Collections.sort(booksFromFile);
//		int i=0;
//		for (Book book : booksFromFile) {
//			System.out.println("#" + ++i +"\t: "+book);
//		}
		
		BooksController bk= new BooksController();
		bk.addReader("Ali", "LIMITED");
		bk.addReader("Veli", "UNLIMITED");
		bk.addReader("Mustafa", "UNLIMITED");
		
		System.out.println(bk.readersList);
		
//		bk.addBook("AudioBook", "Last Command", "one", "hola", 33,1,10,11,3,11);
	}
	
}
