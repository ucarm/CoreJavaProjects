package books;
import people.*;

public abstract class Book implements Comparable<Book>{
	//Encapsulation
	private String title;
	private String genre;
	
	//HAS-A relation. Book HAS-A author. This is called COMPOSITION
	private Author autor;
	private double price;
	
	public Book(String title, String genre, Author autor, double price) {
		super();
		this.title = title;
		this.genre = genre;
		this.autor = autor;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Author getAutor() {
		return autor;
	}
	public void setAutor(Author autor) {
		this.autor = autor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override //overriding from public class
	public String toString() {
		return "title=" + title + ", genre=" + genre + ", author=" + autor + ", price= $" + price;
	}

	@Override //return + number if the object is larger than another object
			  //return - number if the object is smaller than the another object
			  // return 0 if they are same
	
	public int compareTo(Book another) {
		// TODO Auto-generated method stub
		
		 return this.title.toUpperCase().compareTo(another.title.toUpperCase());
		
//		if(this.price > another.price) 
//			return 1;
//		else if(this.price < another.price)
//			return -1;
//		else
//			return 0;
				
	} 
	

	
	
}
