package arrays_day2;

import java.util.Scanner;

public class GroceryShopping {

	public static void main(String[] args) {
		
		String[] products = new String[5];
		products[0] = "apple";
		products[1] = "banana";
		products[2] = "pear";
		products[3] = "bread";
		products[4] = "pie";
		
		double[] prices = new double[5];
//		String[] products1 = new String[] {"apple","banana","pear","bread","pie"};
//		String[] products2 = {"apple","banana","pear","bread","pie"};
		Scanner sc = new Scanner(System.in);
		double sum = 0 ; 
		
		for (int i = 0; i < products.length; i++) {
			System.out.println("Enter price for "+ products[i].toUpperCase());
			prices[i] = sc.nextDouble();
			sum += prices[i];
			System.out.println("Your price for "+products[i]+" is " +prices[i] );
		}
		System.out.println("Your balance is : "+ sum);
		System.out.println("Your Averagr is : "+ sum/products.length);

	}

}
