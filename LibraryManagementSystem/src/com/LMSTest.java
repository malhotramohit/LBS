/**
 * 
 */
package com;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 967524
 *
 */
public class LMSTest {

	static ArrayList<Customer> custlist = new ArrayList<Customer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LMSTest temp = new LMSTest();
		ArrayList<Book> booklist1 = new ArrayList<Book>(5);
		// ArrayList<Book> booklist2=new ArrayList<Book>(5);
		// ArrayList<Book> booklist3=new ArrayList<Book>(5);
		ArrayList<Double> dblm = new ArrayList<Double>();
		boolean fl;
<<<<<<< HEAD

		Book b1 = new Book(1211, "html", "available");
		Book b3 = new Book(1213, "c#", "available");
		Book b4 = new Book(1214, "js", "available");
		Book b5 = new Book(1215, "android", "available");
		Book b6 = new Book(1216, "roid", "available");
		Book b7 = new Book(1217, "and", "available");
		Book b8 = new Book(1218, "dro", "available");

=======
		
		Book b1=new Book(1211,"html","available");
		Book b3=new Book(1213, "c#","available");
		Book b4=new Book(1214, "js","available");
		Book b5=new Book(1215, "android","available");
		Book b6=new Book(1216, "roid","available");
		Book b7=new Book(1217, "and","available");
		Book b8=new Book(1218, "dro","available");
		
>>>>>>> 227e129c289609a9417f680b5d7b8b2c20d37cc7
		booklist1.add(b1);
		booklist1.add(b8);
		booklist1.add(b3);
		booklist1.add(b4);
		booklist1.add(b5);
		booklist1.add(b6);
		booklist1.add(b7);

		/*
		 * booklist2.add(b6); booklist2.add(b2); booklist2.add(b5); booklist3.add(b3);
		 * booklist3.add(b4); booklist3.add(b7);
		 */

		Customer c1 = new Customer(2555.0, "mohit", "malhotra", 533535356, booklist1);
		Customer c2 = new Customer(4555.0, "rohit", "malhotra", 5335356, booklist1);
		Customer c3 = new Customer(3555.0, "fohit", "malhotra", 3535356, booklist1);
		Customer c4 = new Customer(1555.0, "hohit", "malhotra", 335356, booklist1);
		custlist.add(c1);
		custlist.add(c2);
		custlist.add(c3);
		custlist.add(c4);
		System.out.println(temp.loanBook(2555.0, 1211));
		System.out.println(b1.getStatus());
		// dblm=temp.sortBookId(booklist1);
		/*
		 * for(Double b:dblm) { System.out.println(b); }
		 */
		fl = temp.sortBook(booklist1);
		if (fl) {
			for (Book b : booklist1) {
				System.out.println(b.getBookId());
			}
		}
		
		

	}

	public boolean loanBook(double d, int bookId) {
		boolean flag = false;
		int c = 0;
		if (!custlist.isEmpty()) {
			for (int i = 0; i < custlist.size(); i++) {
				for (int j = 0; j < (custlist.get(i).getBkl()).size(); j++) {
					if (custlist.get(i) != null && custlist.get(i).getCustId() == d
							&& (custlist.get(i).getBkl()).get(j).getStatus().equals("available"))
						c++;
				}
			}
		}

		if (!custlist.isEmpty() && c < 5) {
			for (int i = 0; i < custlist.size(); i++) {
				for (int j = 0; j < (custlist.get(i).getBkl()).size(); j++) {
					if (custlist.get(i) != null && custlist.get(i).getCustId() == d
							&& (custlist.get(i).getBkl()).get(j).getBookId() == bookId) {
						(custlist.get(i).getBkl()).add((custlist.get(i).getBkl()).get(j));
						(custlist.get(i).getBkl()).get(j).setStatus("loaned");
						flag = true;
						break;

					}
				}
			}
		}
		return flag;

	}

	/**
	 * @param bookList
	 * @return usage of collection.sort for wrapper class of primitive data types
	 */
	public ArrayList<Double> sortBookId(ArrayList<Book> bookList) {
		ArrayList<Double> dbl = new ArrayList<Double>();
		if (!bookList.isEmpty()) {
			for (Book b : bookList) {
				dbl.add(b.getBookId());
			}
		}
		Collections.sort(dbl);
		return dbl;
	}

	/**
	 * @param bookList
	 * @return usage of collection.sort for object by implementing Comparable <obj>
	 *         interface and override compareTo(obj arg0)
	 */
	public boolean sortBook(ArrayList<Book> bookList) {
		boolean flag = false;
		ArrayList<Book> sortbook = new ArrayList<Book>();
		if (!bookList.isEmpty()) {
			Collections.sort(bookList);
			flag = true;
		}
		return flag;
	}

}
