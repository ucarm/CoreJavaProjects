/*
 * Write a program that reverses each word in a given sentence. Assume words are delimited (separated)
 * by one or more hyphen-minus '-' symbol. Ignore all other delimiters. 
 * 
 * In real life, space is the delimiter. We changed to '-' here because a space is not 
 * visible and hard to debug. 
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
package reverseword;

//import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String line = scan.nextLine();
		char[] letters = line.toCharArray();	//convert the string into a char array
		/**
		 * your code goes here
		 */
		
		
		/**
		 * Do NOT change the following code
		 */
		//char[] lettersOutput= new char[letters.length];
		
		String result="";
		String TempWord="";
		for(int i=0; i<letters.length; i++)
		{
			if(letters[i]=='-') {
				result+=letters[i];
				TempWord="";
			}
			else {
				//do {			
				while(i<letters.length) {
					if(letters[i]=='-') {
						//result+="-";
						i--;
						break;
					}
					else {
					TempWord+=letters[i];
					
					}
					i++;
				}
			
				System.out.println(ReverseWord(TempWord));
				result+=ReverseWord(TempWord);
			}
		}	
		
		System.out.print("Output:");
		//for(char c:lettersOutput) {
		//	System.out.print(c);
		//}
		System.out.println(result);

	}
	//following method reverses the input string
	public static String ReverseWord(String string) {
		// TODO Auto-generated method stub
		String result="";
		for(int i=string.length()-1; i>=0; i--)
			result+=string.charAt(i);
		return result;
	}

}
