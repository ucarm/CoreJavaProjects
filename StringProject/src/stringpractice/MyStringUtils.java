package stringpractice;

public class MyStringUtils {
	
	/*
	 * This method will take a String and return reversend String
	 * for example : 
	 * adam,mada
		Ma,aM
		A,A
		abcd,dcba

	 * */
	
	public String reverseWord(String str) {
		
		String result="";
		for (int i=str.length()-1 ; i>=0; i--) {
			result+=str.charAt(i);
		}
		return result;  
		
	}
	
	/*
	 * This method will take a String and return true false if it is(or not) palindrome
	 * for example : 
	 * "hannah","ana","bob","otto","Wow","Redder"
	 * */
	
	public boolean isPalidrome(String str) {

		return str.toUpperCase().equals(reverseWord(str.toUpperCase())) ;  
		
	}
	/*
	 * This method take a String and character and return the frequency of that letter 
	 * for example 
	 *  I love java,a,2
		Studying hard for oca exam,o,2
		Hard work will pay off eventually,p,1
		CyberTek School is awesome,S,1
		Practice make perfect,Z,0
	 * 
	 * */
	public int countTheLetterFrequency(String str, char letter) {
		
		int count=0;
		for (int i=str.length()-1 ; i>=0; i--) {
			if(letter==str.charAt(i))
				count++;
		}
		return count;  
				
	}
	/*
	 * This method take a sentence as String return first 2 word in switched order
	 * if the sentence have only one word it will return as is
	 * if it has 2 or more words it will return secondWord space firstWord 
	 * for example 
	 *  Adam John,John Adam
		I did,did I
		I must Study Hard,must I
		I can learn Java,can I
		I will be successful,will I
		-,-
		Word,Word
	 * 
	 * */
	
//	public String switchFirst2WordsAndReturn(String sentence) {
//		//String result=sentence;
//		String first="";
//		String second="";
//		int count=1;
//		for (int i=0 ; i<sentence.length(); i++) {
//			if(sentence.charAt(i)!=' ' && count==1) {
//				first+=sentence.charAt(i);
//			}
//			else if(sentence.charAt(i)!=' ' && count==2) {
//				second+=sentence.charAt(i);
//			}	
//			
//			else if(sentence.charAt(i)==' ') {
//				count++;
//			}
//		}
//		
//		return (count>1)? second+" "+first: first;  
//
//	}
	
	public String switchFirst2WordsAndReturn(String sentence) {
		String[] word= sentence.split(" ");
		return (word.length>1)? word[1]+ " "+ word[0]: sentence;
	}

}
