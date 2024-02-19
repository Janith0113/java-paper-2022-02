
public class Book<T,U> {
	

	private T bookTitle;
	private U ISBN;
	
	
	public Book(T bookTitle, U bookISBN) {
		super();
		this.bookTitle = bookTitle;
		this.ISBN = bookISBN;
	}


	
	public U getISBN() {
		return ISBN;
	}
	

	
}
