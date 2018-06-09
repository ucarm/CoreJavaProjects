/**
 * 	Write a program that performs the following:
 * 
 * 1. receives an integer from console and assigns it to the variable n.
 * 2. receives n integers from console and stores them into an array. 
 * 3. prints the even numbers from the array.  
 
For example:

Enter the number of integers: 5
Enter 5 integers: 1 2 3 4 5
Output:2,4,


You will pass tests 1-4 if you correctly implement FindEvenNumbers

 */
package array;

import java.util.Scanner;

public class FindEvenNumbers {

	public static void main(String[] args) {
		int n = 0; 	//number of integers		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of integers: ");
		n = scan.nextInt();
		if(n <= 0) {
			System.out.println("Invalid input");
			System.exit(-1);
		}
		
		/**
		 * Your code goes here
		 * 
		 * Read n numbers from console, store them into an array, and display the even 
		 * numbers from the array 
		 * 
		 * Don't forget to start your output with "Output:"
		 */
		int[] numbers = new int[n];
		String result="";
		System.out.print("Enter "+ n+" integers: ");
		for(int i=0; i<numbers.length; i++){
			numbers[i]=scan.nextInt();
			if (numbers[i]%2==0)
				result+=numbers[i]+",";
		}
		System.out.print("Output:"+result);

	}

}
