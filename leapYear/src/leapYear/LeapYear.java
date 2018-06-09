package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your year :");
		int year= scan.nextInt();
		System.out.println("Leap year :"+leapYear(year));
	}

	public static boolean leapYear(int year) {
		// TODO Auto-generated method stub
		return year%4==0 && year%400==0 && year%100!=0;
	}

}
