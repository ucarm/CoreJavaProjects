package iphone;

public class StaticBlock {

	public static final double PI;
	public static int num;
	
	static {
			System.out.println("1 Level");
			
	}
	
	static {
			System.out.println("2 Level");
			PI= Math.PI;
	}
		
	static {
			System.out.println("3 Level");
	}

	public static void main(String[] args) {
		System.out.println("Before main");
		StaticBlock s1= new StaticBlock();
		StaticBlock s2= new StaticBlock();
		System.out.println("After main");
	}
		
	}


