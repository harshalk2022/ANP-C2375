package com.springex.entity;

public class Book {
	private String bookName;
	private String bookAuthor;
	private int bookPrice;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	public void display() {
		System.out.println("Book Name: "+ bookName + "\nBook Author : " +bookAuthor +"\nBook Price : " +bookPrice);
	}
	

}
