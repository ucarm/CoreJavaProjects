package testsWithLoops;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<9; i++)
		{
			System.out.print("i="+i+"\t");
				for(int j=1; j<i; j++)
					System.out.print("  ");
				for(int k=1; k<=9-i; k++) 
					System.out.print(k+" ");
			System.out.println();
		}
		
	}

}
