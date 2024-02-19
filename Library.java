import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		
		
		HashMap<Integer, Book> bookList = new HashMap<>();
		
		Book<String, String> Book1 = new Book<>("isb1234", "Harry Potter");
		bookList.put(1, Book1);
		
		Book<Integer, String> Book2 = new Book<>( 1234 , "Potter");
		bookList.put(2, Book2);
		
		for (int id : bookList.keySet()) {
            Book value = bookList.get(id);
            System.out.println("Book ID is: " + id + " and the ISBN is: " + value.getISBN());
        }
		
	}
		
}
