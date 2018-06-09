package bmiCalc;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your height in cm :");
		int cm= scan.nextInt();
		System.out.print("Enter your weight in kg :");
		int kg= scan.nextInt();
		double m= cm/100.0;
		double bmi = kg/(m*m);
		System.out.println(Math.round(bmi*100)/100.0);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if (bmi <25)
			System.out.println("Normal weight");
		else if(bmi<30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
	}

}
