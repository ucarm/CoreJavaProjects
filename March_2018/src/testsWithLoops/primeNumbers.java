/*
 * Build a program finds all the prime numbers
 * 
 */

package testsWithLoops;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		boolean prime;
		int number=1; 
		while(number >0) {
			prime =true;
			System.out.print("Enter a number to check if it is a prime number (-1 to exit): ");
			number =scan.nextInt();
			if(number ==-1) {
				System.out.println("Game over...");
				break;	
			}
			
				for(int i=2; i<number;i++) {
					if(number%i==0)
						prime=false;
					
			}
			System.out.print(number +" is  ");
			if(prime)
				System.out.println("a prime number");
			else
				System.out.println("Not a prime number");
		}
	}

}
