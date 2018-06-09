package instancePractice;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your Name:");
		String Name= scan.next();
		System.out.print("Enter your Middle:");
		String mName= scan.next();
		System.out.print("Enter your LastName:");
		String lName= scan.next();
		
		Practice pr = new Practice(); 
		System.out.println("Your initial is : "+pr.FullInitial(Name,mName,lName));
		

	}
/*
	public String Initial(String isim) {
		// TODO Auto-generated method stub
		return isim.toUpperCase().substring(0, 1);
	}
*/
}
