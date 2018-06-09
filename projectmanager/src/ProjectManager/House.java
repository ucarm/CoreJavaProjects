package ProjectManager;

public class House {
	private String type;
	private int houseNumber;
	private double price;
	
	static String neighborhood;
	public String getType() {
		return type;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public double getPrice() {
		return price;
	}

	public House(String type, int houseNumber, double price) {
		this(houseNumber);
		this.type = type;
//		this.houseNumber = houseNumber;
		this.price = price;
	}
	public House(int houseNumber) {
		this();
		this.houseNumber = houseNumber;
	}
	public House() {
		System.out.println("Cleaning empty house");
	}
	
	
}
