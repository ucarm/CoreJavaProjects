package OverLoaded;
//import java.lang.*;
public class OverloadingRules {
	
	private int a;
	private static double b;
	
	public static void main(String[] args) {
		
		short s= 0;
		byte b =12;
		int m=0;
		long l = 12L;
		float f= 0.0F;
		
		OverloadingRules ol = new OverloadingRules();
		System.out.println(ol.a);
		System.out.println(OverloadingRules.b);
		System.out.println("local variable"+m);
	}

}
