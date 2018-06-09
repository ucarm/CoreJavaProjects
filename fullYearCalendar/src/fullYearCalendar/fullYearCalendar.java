/*
 * Generate a 2018 calendar
 * 3/8/2018
 * developer : Mehmet Ucar
 */

package fullYearCalendar;

import java.util.Scanner;

public class fullYearCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What year Do you want to see the Calendar :");
		int year = scan.nextInt();
		
		//variables declared
		String daysSymbol[]= {"Su","M", "Tu","W","Th","F", "S"};
		String months[]= {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY\t", "JUNE", "JULY", "AUGUST\t", "SEPTEMBER","OCTOBER", "NOVEMBER", "DECEMBER" };
		int daysInMonths[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//check if it is a leap year, We can actually do it in a function, but i do it here for now.
		if((year%4==0 && year%100!=0)|| year%400==0)
			{
			System.out.println(year+" is a leap year");
			daysInMonths[1]=29; // it it is a leap year February has 29 days
			}
		
		// ask the user the first day of the year. 
		// We can probably calculate it, but I don't know the algorithm for it.
		// can be fixed later on.
		int newYearDay;
		while(true) {
			System.out.print("Tell me what day the January 1st is (1-7) : ");
			if(scan.hasNextInt()) {
				newYearDay=scan.nextInt();
				if(newYearDay>0 && newYearDay<8)
					break;
				else 
					System.out.println("Please choose a number between 1-7 only");
			}	
			else {
				System.out.println("Please make a valid selection");
			}
		}
		
		//if the month has 31 days, and start with Saturday, it goes to 6th row
		// the calendar will list 3 months per row, and has 4 rows
		
		String [][] monthsList= new String[6][12]; // 6 rows for each month and we have 12 months
			//for(int i=)
		
		
		// now we will fill this calendar with correct numbers,
		System.out.println(monthsList[0][0]);
		
		
		
		
		System.out.println("\n");// get extra spacing
		
		System.out.println("\t\t\t\t\t\t\t\t\t ----"+year+" JAVA CALENDAR--- ");
		
		System.out.println("\n");// get extra spacing
		
		
		/**
		 * The following code is to check if we have 365 days in this year...
		int totalDaysInYear=0;
		for(int i=0; i<daysInMonths.length; i++) {
			totalDaysInYear+=daysInMonths[i];}
		System.out.println("Testing.. Total days in a year: "+totalDaysInYear);
		*/
		
		String firstRow="";
		String secondRow="";
		
		//start the first row
		for(int i=0; i<3; i++) {
			firstRow+="\t\t\t"+months[i]+"\t\t\t\t";
			for(int j=0;j<daysSymbol.length; j++) {
				secondRow+=daysSymbol[j]+"\t";
			}
			secondRow+="\t";
		}
		
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println("\n");// get extra spacing
		
		
		// second row
		firstRow="";//reset the first row and set it to April, May, June
		for(int i=3; i<6; i++) {
			firstRow+="\t\t\t"+months[i]+"\t\t\t\t";
		}
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println("\n");// get extra spacing
		
		// third row
		firstRow="";//reset the first row
		for(int i=6; i<9; i++) {
			firstRow+="\t\t\t"+months[i]+"\t\t\t\t";

		}
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println("\n");// get extra spacing
		
		// forth row
		firstRow="";//reset the first row
		for(int i=9; i<12; i++) {
			firstRow+="\t\t\t"+months[i]+"\t\t\t\t";
		
		}
		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println("\n");// get extra spacing
	
	}

}
