package testsWithLoops;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<9; i++) {
			System.out.print("i="+i+"\t");
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		//method 2
		System.out.println("\n\nMethod 2");
		String a="";
		for(int i=1; i<9; i++) {
			System.out.print("i="+i+"\t");
			a+=i+" ";
			System.out.println(a);
		}
		
	}

}
