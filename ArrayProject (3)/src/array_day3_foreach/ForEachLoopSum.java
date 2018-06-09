package array_day3_foreach;

public class ForEachLoopSum {

	public static void main(String[] args) {
		
		// Task 4 you have array of 5 doubles
		// get the sum of all the doubles using for each loop 
		double[] prices = {1.1,3.4,6.7,99.9,4.4};
		double sum = 0 ; 
		for(double n : prices) {
			sum += n ; 
		}
		System.out.println(sum);

	}

}
