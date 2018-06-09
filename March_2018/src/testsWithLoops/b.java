package testsWithLoops;

public class b {
	public static void main(String[] arg) {
		String s="#";
		for (int i=1; i<=6;i++){
			for(int k=1; k<=6-i; k++)
				System.out.print(" ");
			System.out.println(s);
			s+="##";
		} 
		
		
		
	}

}
