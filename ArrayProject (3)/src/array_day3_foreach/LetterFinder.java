package array_day3_foreach;

import java.util.Scanner;

public class LetterFinder {

	public static void main(String[] args) {
		
		
		//Task 2 
		/*
		 * create a String with 5 names 
		 * assign five names using scanner 
		 * and count how many letter "a" showed up in total in all names	
		 * */
		
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		
		int count = 0 ; 		
		for (int j = 0; j < names.length; j++) {
			
			String str = names[j]; 
			for (int i = 0; i < str.length(); i++) {
				char eachChar = str.charAt(i);
				if(eachChar=='a' || eachChar=='A')
					count++ ;
				//System.out.print( str.charAt(i) + " ");
			}
		}

		System.out.println("count of a in  is :"+ count);
		
//		if(str.contains("a")) {
//			count++ ;
//		}
		

	}

}
