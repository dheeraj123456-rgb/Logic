package ClassProblem;

import java.io.Serializable;

//Create a Book class with bookId, title, author, and price, where bookId is declared as transient.
//Serialize the Book object into a file, deserialize it, and display all the details.

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private transient int bookId; //not serialization
	private String title;
	private String Author;
	private double price;
	
	public Book(int bookId,String title,String Author,double price) {
		this.bookId=bookId;
		this.title=title;
		this.Author=Author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Book id = " + bookId);
		System.out.println("Title = " + title);
		System.out.println("Author = " + Author);
		System.out.println("Price = " + price);
	}
}
public class Demo11 {
	public static void main(String[] args) {
		
	}

}
