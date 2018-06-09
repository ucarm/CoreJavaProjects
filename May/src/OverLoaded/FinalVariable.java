package OverLoaded;

public class FinalVariable {

	int k;
	static long j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 20;
		//i=10; //this won't compile  
		
		final double price=10.0;                                                                      
		
		final String name="Ola";
		final StringBuilder sb = new StringBuilder("SB");
		
//		price =0.0;
//		name= "KK";
		sb.append("SB");
		
		System.out.println(sb);
		print(sb);
	
		
	}
	
	
	
	public static void print(final StringBuilder s) {
		s.append("ZZZ");
		System.out.println(s);
		
	}

}
