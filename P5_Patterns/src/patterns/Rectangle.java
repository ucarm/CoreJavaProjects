/**
 *
 * 	Print Rectangles filled with "*"
 * 
 * Write a program that reads two integers, height and width,  from console 
 * and displays rectangle of the given height and width, filled with asterisks.
 *  You must print the label "Rectangle:" before the rectangle to indicate the 
 *  where rectangle starts.
 * 
Example:

Enter the height:3
Enter the width:8
Rectangle:
********
********
********

Example:


Enter the height:1
Enter the width:1
Rectangle:
*

Example:

Enter the height:0
Enter the width:0
Rectangle:


  
 * @author anwar mamat
 */
package patterns;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int height = 0;
		int width = 0;
		
		//TO DO Enter the height:3
		//Enter the width:8
		//Rectangle:
		// Your code goes here
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the height:");
		height= scan.nextInt();
		System.out.print("Enter the width:");
		width= scan.nextInt();
		System.out.println("Rectangle:");
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
