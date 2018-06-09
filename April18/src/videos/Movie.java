package videos;

public class Movie {
	private String name;
	private double length;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Movie(String name, double length) {
		super();
		this.name = name;
		this.length = length;
	}
	
	
}
