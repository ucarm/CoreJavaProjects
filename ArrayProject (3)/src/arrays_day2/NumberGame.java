package arrays_day2;

public class NumberGame {

	public static void main(String[] args) {
		//Task 1
		// create an int array that have 7 item 
		// assign value for all the items 
		// get the sum of items that more than 10 
		// Task 2
		//  find the number that can be devided by 2 and 3 
		//  print out result of multiplying those numbers 
		
		// Optionally get the max of those 7 numbers
		
		int[] ints = {111,-5,6,8,55,33,45};
		int sum = 0 ; 
		int result = 1 ; 
		for (int i = 0; i < ints.length; i++) {
			if(ints[i]>10) {
				sum += ints[i];
			}
			if(ints[i] % 2==0 && ints[i] % 3==0) {
				//result = result * ints[i];
				result *= ints[i];
			}
			
		}
		System.out.println(sum);
		System.out.println(result);
		
		int max = ints[0] ;
		for (int i = 1; i < ints.length; i++) {
			
			if(ints[i]>max) {
				max = ints[i];
			}
			
		}
		int min = ints[0] ;
		for (int i = 0; i < ints.length; i++) {
			
			if(ints[i]<min) {
				min = ints[i];
			}
			
		}		
		System.out.println("max is : "+ max);
		
		
		
		
	}

}
