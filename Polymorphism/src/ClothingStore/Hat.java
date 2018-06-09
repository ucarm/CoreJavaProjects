package ClothingStore;

public class Hat extends ClothingItem{

	String type;
	
	public Hat(String name, double price, String type) {
		super(name, price);
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hat [type=" + type + ", name=" + name + ", price=" + price + "]";
	}

	
	public void printHatInfo() {
		// TODO Auto-generated method stub
		System.out.println("HatInfo :Hat [type=\" + type + \", name=\" + name + \", price=\" + price + \"]");
	}
	
	public static void main(String[] args) {
	    Shirt s = new Shirt("Polo",100, 'm');
	    ClothingItem c1 = s ; 
	    ClothingItem c2 = new Shirt("Tommy",120, 'L');
	    ClothingItem c3 = new ClothingItem("General",105);
	    System.out.println( c2.toString() ); 
	    s.printShirtInfo();
	    System.out.println(c3.toString());
		
	    
	    Object o = new ClothingItem("Clothing", 200);
	    System.out.println(o.toString());
		
	}
	
}
