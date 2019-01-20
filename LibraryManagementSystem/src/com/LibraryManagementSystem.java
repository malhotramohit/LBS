/**
 * 
 */
package com;

/**
 * @author 967524
 *
 */
public class LibraryManagementSystem {
 //has book
	private Book book;
	//has a customer
	private Customer customer;
	//aggregation just create constructor and initialize 
	public LibraryManagementSystem(Book book, Customer customer) {
		super();
		this.book = book;
		this.customer = customer;
	}
	
}
