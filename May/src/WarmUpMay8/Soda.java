package WarmUpMay8;

public class Soda extends Drink{

	String sodaType;
	public Soda(String name, String type, int size) {
		super(name, type, size);
//		this.sodaType=type;
		System.out.println("3 arg constructor- from Soda");
	}
	public Soda(String type, int size) {
		super(type, size);
//		this.sodaType= type;
		System.out.println("2 arg constructor-from Soda");
	}
	
	

}
