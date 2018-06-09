/**
 * Sort 3 Numbers
 * 
 * This program prompts users to enter 3 numbers (integers) , sorts the numbers in non-descending order, and 
 * displays the numbers in sorted order.
 * 
 *  For example:  
  	Enter an Integer:10
	Enter an Integer:5
	Enter an Integer:20
	Output:5,10,20
 
 *  Testing program checks all your output.  
 *  Your prompts and output format must be same as the example above.
 * 
 * @author anwar mamat
 * 
 */

package sort;

//import java.util.Arrays;
import java.util.Scanner;

public class Sort3Numbers {
	public static void main(String[] args) {

		/**
		 * Read 3 integers from console
		 */
		
		//SOLUTION 1 USING ARRAY 
		/*
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int num1= scan.nextInt();
		System.out.print("Enter an Integer:");
		int num2= scan.nextInt();
		System.out.print("Enter an Integer:");
		int num3 = scan.nextInt();
		
		int sortAr[]=new int[3];
		sortAr[0]=num1;
		sortAr[1]=num2;
		sortAr[2]=num3;
		Arrays.sort(sortAr);
		// TO DO
		// Your code here
		// sort those 3 integers
		
		System.out.print("Output:");	
		//System.out.println(Arrays.toString(sortAr));
		System.out.println(sortAr[0]+","+sortAr[1]+","+sortAr[2]);
		
		***/
		
		//Solution 2 Using List
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int number1= scan.nextInt();
		System.out.print("Enter an Integer:");
		int number2= scan.nextInt();
		System.out.print("Enter an Integer:");
		int number3 = scan.nextInt();
	
		if (number1 > number2) {
		      int temp = number1;
		      number1 = number2;
		      number2 = temp;
		    }

		    if (number2 > number3) {
		      int temp = number2;
		      number2 = number3;
		      number3 = temp;
		    }

		    if (number1 > number2) {
		      int temp = number1;
		      number1 = number2;
		      number2 = temp;
		    }
			System.out.print("Output:");
			System.out.println(number1+","+number2+","+number3);
		
		
	}

}
