//calculates the Square root of a number using Newton's method

package testsWithLoops;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x2= ((n/x1)+x1)/2
		// n is the input
		//x2 is the square root
		int n=99;
		double delta= 0.00001;//0.0000000001;
		double x1=1;
		double x2=1;
		x2= (n/x1 +x1)/2;
		int count=0;
		while(Math.abs(x1-x2)>delta) {
			
			count++;
			System.out.println("trial #"+count +"\troot_old: "+x1);
			System.out.println("trial #"+count +"\troot_new: "+x2);
			x1=x2;
			x2= (n/x1 +x1)/2;
			
		}
		System.out.println(x2);
		
	}

}
