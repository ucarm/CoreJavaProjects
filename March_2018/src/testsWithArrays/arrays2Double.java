package testsWithArrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array= new double[5];
		Scanner sc= new Scanner(System.in);
		for(int i =0; i<array.length; i++){
			System.out.print("Enter value "+(i+1)+" \t: " );
			array[i]= 2*sc.nextDouble();
		}
		for(int i =0; i<array.length; i++){
			System.out.println("Value "+(i+1)+" \t: " + array[i]);

		}
		double sum=0.0;
		for ( double arrInd : array) {
			sum+=arrInd;
		}
		System.out.println("Sum  \t\t: "+sum);
	}

}
