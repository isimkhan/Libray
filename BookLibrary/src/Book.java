
public class Book {

	String author;
	String title;
	int pages;
	String publisher;
	Long phone;
	
	
	public void createBook(String auth, String titl, int pag, String pub, Long cell ) {
		author = auth;
		title = titl;
		pages =pag;
		publisher = pub;
		phone = cell;	
		
		info();
	}
	
	public void info() {
		System.out.println("Author: " + author + "\nTitle: " + title + "\nPages: " + pages);
		System.out.println("Publisher: " + publisher  + "\nPhone number: " + phone);
		System.out.println("___________________________________");
	}
	
	
}
