/**
 * A simple month calendar
 * 
 * Write a program to print a month calendar. 
 * User enters the name of the month, number of days in the month, 
 * and on which day of the week the first day of the month starts.
 * 
 *  Month names: January, February, March, April, May, June, July, August, September, October, November, December
 *  Days: 28, 29 , 30, or 31
 *	First day: 0: Sunday, 1: Monday, 2:Tuesday, 3:Wednesday, 4: Thursday, 5:Friday, 6:Saturday
 * 
 * If user enters May, 31, and 5, it means the calendar is for the month of May. There are 31 days in May, and the first day 
 * of may is Friday. 
 * 
 * When you print, separate the the days with "\t". For example: System.out.print("1\t2") prints 1		2.
 * 
 * Read the tests for more details.
 * 
 * 
 * @author anwar mamat
 * 
 * Example:
 * 
Enter the name of month:Januray
Enter the number of days:31
First day of the month:3
Month Calendar
Month:Januray
S	M	T	W	T	F	S
			1	2	3	4	
5	6	7	8	9	10	11	
12	13	14	15	16	17	18	
19	20	21	22	23	24	25	
26	27	28	29	30	31	

Example

Enter the name of month:February
Enter the number of days:28
First day of the month:2
Month Calendar
Month:February
S	M	T	W	T	F	S
		1	2	3	4	5	
6	7	8	9	10	11	12	
13	14	15	16	17	18	19	
20	21	22	23	24	25	26	
27	28	
 */
package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		//Please read the instruction above
		
		String monthName = "";	// name of the month, January, Februdary etc
		int firstDay = 0;	// 0: 1st day is Sunday, 1: 1st day is Monday and so on
		int days = 31; 		// number of days in a given month
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of month:");
		monthName =  scan.nextLine();
		System.out.print("Enter the number of days:");
		days =  scan.nextInt();
		System.out.print("First day of the month:");
		firstDay =  scan.nextInt();
		
		System.out.println("Month Calendar");
		System.out.println("Month:" + monthName);
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		
		//TO DO
		//Your code hoes here
		String result="";
		int temp=0; // to keep the date
		for (int i =1; i< days+firstDay+1; i++) {
			temp= i-firstDay;
			if(firstDay>i-1) {
				result+=" \t";// leave spaces for the 1st row;
			}
			else if(i%7==0) {
				result+=(temp)+"\n";
			}
			else {
				result+=(temp)+"\t";
			}
			
		}//for loop ends here
	
		System.out.println(result);
	}

}
