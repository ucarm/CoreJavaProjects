package WarmUpMay8;

public class Drink {

	String name;
	String type;
	int size;
	
	public Drink(String name, String type, int size) {
		this.name=name;
		this.type=type;
		this.size= size;
		System.out.println("3 argument constructor-Drink");
	}

	public Drink(String type, int size) {
		super();
		this.type = type;
		this.size = size;
		System.out.println("2 arg contructor-Drink");
	}
	
	
	
}
