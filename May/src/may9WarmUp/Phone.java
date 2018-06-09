package may9WarmUp;

public class Phone {
	
	private String brand;
	private int size;
	public String getBrand() {
		return brand;
	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	public int getSize() {
		return size;
	}
//	public void setSize(int size) {
//		this.size = size;
//	}
	public Phone(String brand, int size) {
		super();
		this.brand = brand;
		this.size = size;
	}
	
	public Phone() {
		System.out.println("no-arg from Phone.");
	}
	protected void makeCall() {
		System.out.println("making a call");
	}
	
	
}
