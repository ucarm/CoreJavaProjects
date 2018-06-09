package testsWithLoops;

// find all numbers that
//abc = a^3+b^3+c^3
//between 100-500

public class cubes {
	public static void main(String[] args) {
		for (int i=100; i<=500; i++) {
			int first= i/100;
			int second= (i/10)%10;
			int third= i%10;
			int res= first*first*first+ second*second*second+ third*third*third;
			if(i==res)
				System.out.println(i);
		}
	
	}
}

