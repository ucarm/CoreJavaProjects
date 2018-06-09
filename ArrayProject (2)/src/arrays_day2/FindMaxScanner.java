package arrays_day2;

import java.util.Scanner;

public class FindMaxScanner {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter 5 number for finding max");
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = sc.nextInt();
			
		}
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]>max) {
				max = numbers[i];
			}
			
		}
		System.out.println("your max is "+ max);
		
		
		
		

	}

}
