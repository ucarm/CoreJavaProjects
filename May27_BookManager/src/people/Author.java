package people;

import java.util.List;

public class Author{
	
	private String name;
	private List<String> genres;
		
	//Constructor overloading
	public Author(String name) {
		super();
		this.name = name;
	}

	public Author(String name, List<String> genres) {
		this(name);
		this.genres = genres;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return  name;
	}
	
	
}
