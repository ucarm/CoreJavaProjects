package day2;

import java.util.Arrays;
import java.util.Iterator;

public class JackOfAll {

	/**
	 * 
	 * @param s1  is first name 
	 * @param s2 is last name 
	 * @return  first initial of first name and whole last name without a space
	 * 			all lower case
	 */
	public String generateUserName(String s1, String s2) {
		String result="";
		String first[] = s1.split(" ");
		String last[] = s2.split(" ");
		
		result+= first[0].toLowerCase().trim().charAt(0);
		for(int i=0; i<last.length; i++)
			result+=last[i].trim().toLowerCase();
		
		return result ; 
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public StringBuilder reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] words= s.split(" ");
		String temp;
		for (int i = 0; i < words.length; i++) {
			temp="";
			for(int j= words[i].length()-1; j>=0; j--) {
				temp+=words[i].charAt(j);
			}
			sb.append(temp);
		}
		return sb;
	
	}
	/**
	 * 
	 * @param  it will take 1 int array 
	 * @return the reversed int array
	 */
	public int[] reverseIntArray(int[] ints) {
		int[] result = new int[ints.length];
		for(int i= 0; i<result.length; i++)
			result[i]=ints[result.length-1-i];
		return result ;
	
	}
	/**
	 * 
	 * @param n as the last number 
	 * 
	 * @return 1 + 2 + 3 + ...... + n 
	 */
	public int sumOfNumberFrom1ToN(int n) {
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
			
		}
		return sum;

	}
	
	/**
	 * 
	 * @param isPrimeMember
	 * @param price
	 * @return
	 *  if you are prime member 0 
	 *  if your price is more than 35 , return  0
	 *  if not the shipping 5 dollar  
	 */
	public int calculateShipping(boolean isPrimeMember, double price) {
		
		return isPrimeMember || price>35 ? 0: 5  ; 
	}

	/**
	 * 
	 * @param s
	 * @return first character is capital all others lowercase
	 */
	public String makeFirstCharCapital(String s) {
		//s.trim();
		String result="";
		result+=s.toUpperCase().charAt(0); 
		result+=s.toLowerCase().substring(1);
		return result; 
	}

	/**
	 * 
	 * @param sentence
	 * @return
	 */
	public String makeFirstCharEveyWordCapital(String sentence) {
		String [] words=sentence.split(" ");
		String result="";
		for (int i = 0; i < words.length; i++) {
			result+=makeFirstCharCapital(words[i])+" ";
		}
		
		return result.trim();
	}	
	/**
	 * 
	 * @param  getNumberOutOfString s
	 * @return  the string contain only number as int 
	 */
	public int getNumberOutOfString(String s) {
		
		 
		// Character.isDigitChar(yourchar ) will check whether it's a number
		String num="0";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
					num+=s.charAt(i);
		}
		
		return Integer.parseInt(num);
	}

	/**
	 * 
	 * @param is 
	 *  given an array is , find out whether First Or Last Item More Than 5
	 * @return
	 */
	public boolean checkIfFirstOrLastItemMoreThan5(int[] is) {
		// TODO Auto-generated method stub
		return is[0]>5 || is[is.length-1]>5;
	}

	/**
	 * 
	 * @param is
	 * @return true if all the items values are more than 20 
	 */
	public boolean checkAllLongsAreMoreThan20(int[] is) {
		// TODO Auto-generated method stub
		boolean result=true;
		for (int i = 0; i < is.length; i++) {
			result= result && is[i]>20;
		}
		return result;
	}

	/**
	 * 
	 * @param ints
	 * given an int array ,  
	 * @return return max number in the array 
	 */
	public int findMaxOfAllNumbers(int[] ints) {
		Arrays.sort(ints);
		
		return ints.length>0? ints[ints.length-1]:0;
	}
	/**
	 * 
	 * @param is
	 * @param is2
	 * @return  if array 1 max is more than array 2 return  1
	 *          if array 2 max is more than array 1 return -1
	 *          if array 1 max is equal array 2 return  0
	 *          
	 */
	public int compareMaxOf2Arrays(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		int max1= findMaxOfAllNumbers(is);

		int max2= findMaxOfAllNumbers(is2);
		if(max1>max2)
			return 1;
		else if (max2>max1)
			return -1;
		else
			return 0;
	}
	
	/**
	 * 
	 * @param string
	 * @return
	 */
	public boolean checkStringContainsNumber(String string) {
		// TODO Auto-generated method stub  Character.isDigit again
//		boolean result= false;
		for (int i = 0; i < string.length(); i++) {
			if(Character.isDigit(string.charAt(i)))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param strings
	 * @return
	 * You have a String array , each String items might contain number 
	 * concatinate all the chacarater that is number 
	 * eventually return this number as long 
	 * if no item has number return 0 
	 * 
	 *  {"ABC12","1CC9",{"SSS"}}  ---> 1219 as long data type
	 * 
	 */
	public long getNumberOutOfStringArray(String[] strings) {
		StringBuilder sb= new StringBuilder("0");
		for (int i = 0; i < strings.length; i++) {
			if(getNumberOutOfString(strings[i])>0)
			sb.append(getNumberOutOfString(strings[i]));
//			System.out.println(sb.toString());
		}
//		System.out.println(Long.parseLong(sb.toString()));
		return Long.parseLong(sb.toString());
		}

	/**
	 * 
	 * @param strings
	 * @return
	 *  You have a String array , each String items might contain number 
	 *  Get the number character , convert to int , then get the sum of all 
	 *  
	 *  {"ABC12","1CC9",{"SSS"}}  --->13
	 *  
	 * 
	 */
	public int sumEachNumberContainedInsideStringArray(String[] strings) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i = 0; i < strings.length; i++) {
			
				sum+=getNumberOutOfString(strings[i]);
//					System.out.println(sum);
			
		}
		
		return sum;
	}

	/**
	 * 
	 * @param string
	 * @return
	 * if this String has word true or false anywhere return true 
	 * 
	 * 
	 */
	public boolean checkIfBooleanWordExistsInString(String string) {
		string=string.toLowerCase();
		return string.contains("true") || string.contains("false");
	}


	
	
	
}
