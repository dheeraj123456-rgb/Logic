package ClassProblem.ExceptionHandling;

class Book{
   		void BookDetails() {
   			System.out.println("This is a book");
   		}
}

class Magazine{
	void Magazine() {
		System.out.println("This is a mazagine");
	}
}

public class Demo {

	public static void main(String[] args) {
		Magazine magazine = new Magazine();
		
		Object obj = magazine;

		try {
			Book book = (Book) obj;
			book.BookDetails();
		}catch(ClassCastException e) {
			System.out.println("classcastexception occured");
			System.out.println("Cannot cast Magazine objects to Book");
		}
		System.out.println("Program continue.......");
	}

}
