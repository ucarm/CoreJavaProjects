package testsWithLoops;

public class c {

	public static void main(String[] args) {
		String s="#";
		for (int i=1; i<=6;i++){
			for(int k=1; k<=6-i; k++)
				System.out.print(" ");
			System.out.println(s);
			s+="##";
		} 
		
		for (int i=1; i<=6;i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for (int k=1; k<=(6-i)*2-1 ;k++ )
				System.out.print("#");
			System.out.println();
			
		}
	}

}
