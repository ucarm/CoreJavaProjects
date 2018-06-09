/**
 * Write a program, which receives a sequence of integers, stores them into an array, 
 * delete a given number from the array, and display the remaining array. If the given 
 * number does not exit in the array, display the original array.
 
Example 1:
 
Enter the number of integers: 5
Enter 5 integers: 2 3 5 8 10
Enter the number to be deleted: 8
Output:2,3,5,10,

Example 2:

Enter the number of integers: 3
Enter 3 integers: 10 20 30
Enter the number to be deleted: 15
Output:10,20,30,




You will pass tests 5-8 if you correctly implement DeleteFromArray

 */
package array;

import java.util.Scanner;

public class DeleteFromArray {

	public static void main(String[] args) {
		
		int n = 0; 	//number of integers
		int d = 0; 	//the number to be deleted
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of integers: ");
		n = scan.nextInt();
		if(n <= 0) {
			System.out.println("Invalid input");
			System.exit(-1);
		}
		int[] buffer = new int[n];
		System.out.print("Enter " + n +" integers: ");

		
		/**
		 * 	Your code goes here
		 * 	Read n  integers from console and store then into buffer
		 */
	
		for(int i=0; i<n;i++)
		{
			buffer[i]=scan.nextInt();
			
		}
		System.out.print("Enter the number to be deleted: ");
		d = scan.nextInt();
		
		/**
		 * Your code goes here
		 * 
		 * Delete the number d from the array buffer, and display the 
		 * remaining array
		 */
		String result="";
		for(int i=0; i<n;i++)
		{
			//buffer[i]=scan.nextInt();
			if(buffer[i]!=d)
				result+=buffer[i]+",";
			
		}
		
		System.out.println("Output:"+result);
		
	}

}
