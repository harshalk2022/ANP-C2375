package org.practicaltest.view;

import java.util.ArrayList;
import java.util.Scanner;

import org.practicaltest.model.Book;
import org.practicaltest.model.Category;
import org.practicaltest.service.BookService;

public class BookView {static Scanner sc = new Scanner(System.in);
static ArrayList<Book> bookset = new ArrayList<>();
public static boolean addBook() {
	
	System.out.print("Enter book Id : ");
	String bookId = sc.next();
	try {
		bookid(bookId);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.print("Enter book title : ");
	String title = sc.next();
	
	System.out.print("Enter book's author name : ");
	String author = sc.next();
	
	System.out.print("Enter book's category : ");
	String category = sc.next();
	try {
		category(category);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.print("Enter book price : ");
	float price = sc.nextFloat();
	try {
		checkprice(price);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	 
	System.out.println();
	 
	Book book = new Book(bookId, title, author, category, price);
	BookService.addBook(book);
	return true;
	}

	public static void checkprice(float price) throws InvalidPriceException {
		if(price>0) {
			System.out.println(price);
		}
		else {
			throw new InvalidPriceException("Not a valid price");
		}
	}

	public static void category(String category) throws InvalidCategoryExceptin {
		 if(category.equals("Science")||category.equals("Fiction")||category.equals("Technology")||category.equals("Others")) {
			 System.out.println(category);
		 }
		 else{
			 throw new InvalidCategoryExceptin("Not valid categeory");
		 }
			 
	}

	public static void bookid(String bookId) throws InvalidBookidException {
		if(bookId.length()==4&&bookId.charAt(0)=='B') {
			System.out.println(bookId);
		}
		else {
			throw new InvalidBookidException(bookId);
		}
		 
	}

	public static ArrayList<Book> displayBook(){
		return BookService.displayBook();
	}
	

}
