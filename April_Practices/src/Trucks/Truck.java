package Trucks;

public class Truck {
	private String name;
	private int year;
	private double price;
	
	public Truck(String name) {
		this.name= name;
	}
	
	public Truck(String name, int year, double price) {
		this.name= name;
		this.year= year;
		this.price=price;
	}
	
	public int getNane() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void  doMonsterThing() {
		price= price*1.1;
		System.out.println("Monster truck rocks.");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Name : "+name+". Year:"+year+" .price: $"+price; 
	}
}
