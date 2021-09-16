import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest {

	public static void main(String[] args) {
		
		Book b1 = new Book(1,"ElonMusk","Author1",1,700.50,300);
		Book b2 = new Book(2,"Ramayan","Valmiki",1,900.0,600);
		Book b3 = b1;
		Book b4 = new Book(3,"Bhagvathgita","Vyasa",1,1100,900);
		Book b5 = new Book(5,"Vedas","Vyasa",1,600.5,500);
		Book b6 = new Book(1,"ElonMusk","Author1",1,700.50,300);
		
		System.out.println("Books are ready..");
		
		HashSet<Book> books = new HashSet<Book>();
		System.out.println("Adding books to hashset..");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b1);
		books.add(b6);
		
		System.out.println("Added Books..");
		
		for(Iterator<Book> bitr = books.iterator();bitr.hasNext();) {
			System.out.println("-: "+bitr.next());
		}
		
		
		
	}

}

class Book{
	private int bookID;
	private String bookName;
	private String author;
	private int edition;
	private double price;
	private int noOfPages;
	
	public Book(int bookID, String bookName, String author, int edition, double price, int noOfPages) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.edition = edition;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", author=" + author + ", edition=" + edition
				+ ", price=" + price + ", noOfPages=" + noOfPages + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(author, bookID, bookName, edition, noOfPages, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookID == other.bookID
				&& Objects.equals(bookName, other.bookName) && edition == other.edition && noOfPages == other.noOfPages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
	
}
