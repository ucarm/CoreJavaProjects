package testsWithArrays;

import java.util.Scanner;

public class arryas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// be careful. bear shouldn't ingest large flooffy dog.
		// boolean , char, byte, short, int, large, float, double.
		Scanner scan= new Scanner(System.in);
		String[] names= new String[4];
		for(int i=0; i<names.length;i++) {
			System.out.print("Enter a name: ");
			names[i]= scan.next();
		}
		for (int i=0; i<names.length; i++) {
			System.out.print("Name "+ (i+1)+" is "+ names[i]);	
			System.out.println("\t\tInitial "+ (i+1)+" is "+ names[i].toUpperCase().charAt(0));
		}
	}

}
