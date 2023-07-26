//program to demonstrate on default and parameterized constructor
package org.tnsif.classcndobject;

public class Library {
	//public data members
	
	public long noOfBooks;
	public String authorName;
	public String  bookName;
	public double price;
	
	//default constructor
	public Library() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	//parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	
	
	
	
		
		
	
	
	
	
	
}

