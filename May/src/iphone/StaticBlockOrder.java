package iphone;

public class StaticBlockOrder {

	public static final String order;
	static int num =10;
	
	static {
		order= "MyOrder";
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	
	
	
	public static int doubleTheNumber() {
		System.out.print("Original value: ");
		System.out.println(num);
		num*=2;
		return (num);
	} 
	
	public StaticBlockOrder() {
		System.out.println("Message from no arg constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockOrder one = new StaticBlockOrder();
		StaticBlockOrder two = new StaticBlockOrder();
		System.out.println(StaticBlockOrder.order);
		
		System.out.println(StaticBlockOrder.doubleTheNumber());
		
		
	}

}
