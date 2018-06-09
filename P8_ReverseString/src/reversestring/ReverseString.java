/*
 * Write a program that reverses a string stored in a char array.
 * 
Example 1:

Enter a sentence:I-am-awesome
Output:I-ma-emosewa


Example 2:

Enter a sentence:---I-like-----Java.
Output:---I-ekil-----.avaJ


Example 3:

Enter a sentence:javais-easy------
Output:siavaj-ysae------  


Example 4:

Enter a sentence:The-No.-1-reason-people-fail-in-life-is-because-they-listen-to-their-friends,-family,-and-neighbors.
Output:ehT-.oN-1-nosaer-elpoep-liaf-ni-efil-si-esuaceb-yeht-netsil-ot-rieht-,sdneirf-,ylimaf-dna-.srobhgien


If you are frustrated with this assignment, please read the test10.txt,  test11.txt,  test12.txt,  test13.txt,  
test14.txt, and  test15.txt.   


 */
package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String line = scan.nextLine();
		char[] letters = line.toCharArray();	//convert the string into a char array
		/**
		 * your code goes here
		 */
	

		String result="";
		String TempWord="";
		for(int i=letters.length-1; i>=0; i--)
		{
			if(letters[i]=='-') {
				result+=letters[i];
				TempWord="";
			}
			else {
				//do {			
				while(i>=0) {
					if(letters[i]=='-') {
						//result+="-";
						i++;
						break;
					}
					else {
					TempWord+=letters[i];
					}
					i--;
				}
			
				//System.out.println(ReverseWord(TempWord));
				result+=TempWord;
			}
		}	
		
		System.out.print("Output:");
		System.out.println(result);
	}
		//for(char c:lettersOutput) {
		//	System.out.print(c);
		//}
		//System.out.print(result);	
		/**
		 * Do NOT change the following code
		 */
		
		
		
		//System.out.print("Output:");
		//for(char c:letters) {
		//	System.out.print(c);
		
		//}

	
	
	public static String ReverseWord(String string) {
		// TODO Auto-generated method stub
		String result="";
		for(int i=string.length()-1; i>=0; i--)
			result+=string.charAt(i);
		return result;
	}
	

}
