/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */
package date;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date(12,27,1997);
		
		Date d2 = new Date(2,7,1999);
		
		System.out.println("Date:"+d1);
		if(Date.isValid(1, 21, 2011)){
			System.out.println(d1 + " is a valid date");
		}else{
			System.out.println(d1 + " is NOT a valid date");
		}
		
		System.out.println(d2);
		System.out.println("Age:"+d1.getAge());
		
		System.out.println((new Date(4, 29, 1919)).dateToWords());
		System.out.println("April Twenty Nine One Thousand Nine Hundred Nineteen");
	}

}
