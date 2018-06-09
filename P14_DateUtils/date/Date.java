/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */

package date;
import java.time.LocalDate;

public class Date {
	
	// This is a static field to represent final day of each month
	// There are 13 items intentionally so you can start from index 1-12 instead of 0.
	private static int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
	
	// These 3 instance fields are for representing a date attribute
	private int month;
	private int day;
	private int year;

	/** This is a 3 arguments Constructor
	 * Used for Initializing a new date from the month, day and year.
	 * @param month : the month (between 1 and 12)
	 * @param day   : the day (between 1 and 28-31, depending on the month)
	 * @param year  : the year
	 
	 */

	public Date(int month, int day, int year){
		
		//DO NOT CHANGE --THIS IS USED TO CHECK FOR INVALID DATE
		if(!isValid(month, day, year)){
			System.out.println("Invalid Date");
			throw new IllegalArgumentException();
		}
		////////////// TODO : Assign instance field value
		this.month=month;
		this.day=day;
		this.year=year;
	}
	
	
	/** 
	 * @param year
	 * @return true if the given year is a leap year. false otherwise.
	 * leap year definition :
	 * leap year can be divided by 400 without fraction 
	 * leap year can not be divided 100 without fraction
	 * leap year can be divided by 4 without fraction 
	 */
	public static boolean isLeapYear(int year){
		//TO DO
		return (year%4==0 && year%100!=0 )|| year%400==0;
	}

	/**
	 * This method checks if a given date is a valid calendar date
	 * 
	 * @param m  month 
	 * 		month have to be from number 1-12 if not it's invalid date 
	 * @param d  day
	 *      day have to be from 1 - End Day Of The Month
	 *      You can get End Day of the month from DAYS Array according to index
	 *      any day not within the range make it invalid date
	 *      
	 *      if It's not a leap year and February have more than 28 days 
	 *      it's a invalid date 
	 *      
	 * @param y  year. (A year is no less than 1900, and no greater than 2100)
	 * @return  true if the given date is a valid calendar date. false otherwise
	 */
	public static boolean isValid(int m, int d, int y){
		//TO DO
		//check for days
		boolean valid = (m>=1 && m<=12) && (y>=1900 && y<=2100); 
		boolean validDays;
		
		if(  isLeapYear(y) && m==2  ) 
			validDays= d<=29 && d>=1;
		else
			validDays= d>=1 && d<=DAYS[m];

		return valid && validDays;
	}

	/** 
	 * @return month of that month
	 */
	public int getMonth(){
		return this.month; 
	}

	/** 
	 * @return day of that day
	 */
	public int getDay(){
		return this.day;
	}

	/** 
	 * @return year of that year
	 */
	public int getYear(){
		return this.year;
	}


	/**
	 * This method is used to compare this date object 
	 *    to a new date object passed to the methoed as argument
	 * Compare this date to that date.
	 * @return {-1 or zero or 1 integer}, 
	 * depending on whether this date is {before, equal to, after} that date
	 * if this date is before that date return -1
	 * if this date is equal to that date return 0
	 * if this date is after that date return 1
	 */

	public int compareTo(Date that) {
		//TO DO
		if (this.year> that.year)
			return 1;
		else if (this.year< that.year)
			return -1;
		else {
			if (this.month> that.month)
				return 1;
			else if (this.month< that.month)
				return -1;
			else {
				if (this.day> that.day)
					return 1;
				else if (this.day< that.day)
					return -1;
				else {
					return 0;
					
				}// same date
				
			}// compare days
			
		} //compare months   
	}// method ends

	/**
	 * Return a string representation of this date.
	 * @return the string representation in the format MM/DD/YYYY
	 */
	public String toString(){
		//TO DO
		return (month<10 ? ""+month+"/" : month+"/")+(day<10? ""+day+"/" : day+"/")+year;
	}

	/**
	 * This method will calculate the age of person and return as an int
	 * ATTENTION : 
	 * When a person was born on May 1st, 2000  
	 * and today's date is April 23, 2018 , he is still considered 17 until May 1st.
	 */
	
	public int getAge(){
		///DO NOT CHANGE 
		LocalDate cal = LocalDate.now();
		int d = cal.getDayOfMonth();   // day number of today's date
	    int m = cal.getMonthValue();   // month number of today's date
	    int y = cal.getYear();         // year number of today's date
	    //-------------------------------------
	    
	    //int age = 0;
	    // TO DO
	    if(month>m)
	    	return y-year-1;
	    else if(month<m)
	    	return y-year;
	    else if (month==m){
	    	if(day>d)
	    		return y-year-1;
	    }
	    return y-year;
	}

	/**
	 *  THIS METHOD IS OPTIONAL 
	 *  YOU CAN IMPLEMENT AND TEST IT IF YOU ARE DONE EARLY IN CLASS
	 *  
	 * @return the word representation of the date.
	 * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen" 
	 */
	public String dateToWords() {
		String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
		String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] yearWords = {"Hundred", "Thousand"};
		
		// TO DO 
		String result= monthWords[month-1]+" ";// get the month name added
		int lastTwoDigits=day;
		if(lastTwoDigits<10)
			result+= numbersLessThanTen[lastTwoDigits-1]+" ";
		else if(lastTwoDigits==10)
			result+="Ten ";
		else if(lastTwoDigits>10 && lastTwoDigits<20)
			result+= numbersBetweenTenAndTwenty[lastTwoDigits-11]+" ";
		else 
			result+=multiplesOfTen[lastTwoDigits/10-1]+" "+numbersLessThanTen[lastTwoDigits%10-1]+" ";
		
		
		result+=numbersLessThanTen[year/1000-1]+" Thousand"+" ";//print thousands
		
//	Following solution did not work
//		if(year%1000>0 && year%1000<10)
//			result+=numbersLessThanTen[year%1000-1]+" ";
//		else if(year%1000>10 && year%1000<20)
//			result+= numbersBetweenTenAndTwenty[year%1000-11]+" ";
//		else {
		
		// now add hundreds year%100 
		int hundreds= (year%1000)/100; 
		if(hundreds!=0)
			result+= numbersLessThanTen[hundreds-1]+" Hundred ";
		lastTwoDigits= year%100;
		if(lastTwoDigits!=0) {
		if(lastTwoDigits<10)
			result+= numbersLessThanTen[lastTwoDigits-1]+" ";
		else if(lastTwoDigits==10)
			result+="Ten ";
		else if(lastTwoDigits>10 && lastTwoDigits<20)
			result+= numbersBetweenTenAndTwenty[lastTwoDigits-11]+" ";
		else {
			result+=multiplesOfTen[lastTwoDigits/10-1]+" "+numbersLessThanTen[lastTwoDigits%10-1];
			 
		}
		}
		
			
		
		return result;
	}
}

