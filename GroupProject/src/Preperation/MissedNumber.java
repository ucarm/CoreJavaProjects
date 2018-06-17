package Preperation;

import java.util.ArrayList;

public class MissedNumber {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,16};
		System.out.println("MISSED NUMBERS");
		showMissedNumbers(numbers);
	}

	private static void showMissedNumbers(int[] numbers) {
		int max= numbers[0];
		int min= numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>=max) {
				max=numbers[i];
			}
			if(numbers[i]<=min)
				min = numbers[i];
		}
		for(int i=min; i<=max; i++) {
			boolean bo=true;
			for(int j=0; j<numbers.length;j++)
			{
				if(i==numbers[j]) {
					bo=false;
					break;
				}
			}	
			if(bo)
				System.out.print(i+" , ");
		}
	
	
}
}
