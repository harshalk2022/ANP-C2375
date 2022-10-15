package org.practicaltest.service;

import java.util.ArrayList;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;

public class BookService {
	static ArrayList<Book> bookset = new ArrayList<>();
	
	public static void addBook(Book book) {
		BookDAO.addBook(book);
	
	}
	
	public static ArrayList<Book> displayBook(){
		return BookDAO.displayBook();
	}
}
