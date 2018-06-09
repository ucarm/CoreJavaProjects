package arrays;

import java.util.Scanner;

public class ModifyingArray {

	public static void main(String[] args) {
		
		// create a double array of 5 items 
		// get the value from user using scanner
		// double the value on one line   2->4  3->6
		// and print it out in another line 
		// example if you have 2 you should get 4.0
		Scanner sc = new Scanner(System.in);
		//double[] prices =  new double[5]; 
        //double[] prices = new double[] {sc.nextDouble(),sc.nextDouble(), 7.87, 8.11 , 1.0};
		double[] prices = new double[]{1.2, 3.5, 7.87, 8.11 , 1.0} ; 
		
		//double[] prices = {1.2, 3.5, 7.87, 8.11 , 1.0} ; 
		for(int i=0 ; i <prices.length; i++ ) {
			prices[i] = prices[i]*2 ;
			System.out.println(prices[i]);
		}
		double sum = 0 ; 
		for(int i=0 ; i <prices.length; i++ ) {
			sum = sum + prices[i] ; 
			//System.out.println(prices[i]);
		}
		System.out.println("Sum is "+ sum);
		
		
		
		// optionally get the sum of the value 
		// your output should be "Sum of 1.2 3.5 ... is  18.18"

	}

}
