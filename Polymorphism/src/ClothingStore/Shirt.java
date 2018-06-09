package ClothingStore;

public class Shirt extends ClothingItem{
	char size;
	
	public Shirt()
	{
		super("Shirt", 2.99);
	}
	
	public Shirt(String name, double price, char size) {
		super(name,price);
		this.size=size;
	}

	@Override
	public String toString() {
		return "Shirt [size=" + size + ", name=" + name + ", price=" + price + "]";
	}

	public void printShirtInfo() {
		// TODO Auto-generated method stub
		System.out.println("ShirtInfo : Shirt [size=" + size + ", name=" + name + ", price=" + price + "]");
	}
	
	
	
}
