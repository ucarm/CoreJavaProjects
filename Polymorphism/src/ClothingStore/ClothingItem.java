package ClothingStore;

public class ClothingItem {
	String name;
	double price;
	public ClothingItem() {
		
	}
	
	public ClothingItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ClothingItem [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
