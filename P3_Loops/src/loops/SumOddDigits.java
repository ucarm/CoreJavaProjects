/**
 * Read an integer n from console, and calculate the sum of odd digits of that integer n.
 * For example: 
 * 
 * ------------------
 * Enter an integer:32677
 * Sum = 17
 * ---------------------
 * 
 *  In above example, the input n is 32677, which has 3 odd digits  3, 7, 7. 
 *  3 + 7 + 7 = 17.   Therefore, the result is 17.
 *  
 *   @author anwar mamat
 *   
 */
package loops;

import java.util.Scanner;

public class SumOddDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter an integer:");
		//TO DO 
		//Write your code here
		int number = sc.nextInt();
		
		while(number!=0) {
			
			if((number%10)%2==1)
				sum+=(number%10);
			
			number/=10;
		}
		//System.out.println("Sum = "+sum);
				
		
		System.out.println("Sum:" + sum);
		sc.close();
	}

	
}
