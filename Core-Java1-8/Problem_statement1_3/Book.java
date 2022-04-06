package com.coreproject3;

import java.util.List;

/*
 * 1.3 Create a class Book which describes its book_title and book_price. Follow the below steps,
 * a.Use getter and setter methods to get & set the Books description.
 * b.Implement createBooks and showBooks methods to create n objects of Book in an array.
 * c.Display the books along with its description as follows,
 *    Book  Title      Price
 *    Java Programming Rs 350.50
 *    Let Us C         Rs.200.00
 * d.Note: createBooks & showBooks should not be member functions of Book class
 * */
public class Book {

	
	private String bookTitle;
	private float bookPrice;
	
	Book(){
		
	}
	
	public Book(String bookTitle, float bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public void showBooks() {
		
		System.out.println("title : "+book.getBookTitle());
		System.out.println("price : "+book.getBookPrice());

		
	}
	
	public List<Book> createBooks(){
		List<Book> book;
		book.add(e.);
		return book;
		Book book=new Book();
	}
}
