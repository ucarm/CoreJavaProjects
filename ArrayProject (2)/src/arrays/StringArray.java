package arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		// create a string array that can hold 4 items
		// call it names : assign value for first 3 the items
		// loop through array to print the value of each item 
		// observe what you get for unassigned item value
		// output should be in this format "name 1 is Adam "
		String[] names = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 names:");
		
		for(int i = 0 ; i<names.length;i++) {
			names[i] = sc.nextLine();
		}
//		names[1] = sc.nextLine();
//		names[2] = sc.nextLine();
//		names[3] = sc.nextLine();
		for(int i=0; i<4 ; i++) {
			//System.out.println("Name "+(i+1) + " is " +  names[i]);
			//System.out.println("First Char "+(i+1) + " is " +  names[i].charAt(0));
			System.out.println("First Char is " +  names[i].substring(0, 1));
		}
		//// Instead of getting "name 1 is Adam "
		//// outout "first character is A"
		
		
		
	
	}

}
