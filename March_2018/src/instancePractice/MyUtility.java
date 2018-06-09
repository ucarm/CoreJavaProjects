package instancePractice;

public class MyUtility {
	String name;
	
	public int asciiVal(char ch) {
		return (int)ch;
	}

	public String asciiTable(int a, int b) {
		/* This method returns all the chars 
		 * from int a to int b
		 * output is a String
		 */
		
		String result="";
		for(int i=a; i<=b; i++) {
			
			result+= i%3==0 ? i+" = "+(char)i+"\n" : i+" = "+(char)i+"\t\t\t";
		
		}
		return result;
	}
	
	public void displayUtil() {
		System.out.println(name);
	}
	// following method generates a ASCII table
	public String displayEachCharAsciiNumber(String str) {
		
		String result="";
		for(int i=0; i<str.length(); i++)
			result+=str.charAt(i)+"= "+asciiVal(str.charAt(i))+"\t";
		return result;
	}
	
	public char getChar(int number) {
		return (char)number;
	}
	
	public String printOnlyAtoZ(String str) {
		String result="";
		char[] arr=str.toCharArray();
		for(char a: arr) {
			if ((int)a>64 && (int)a<91)
				result+=a;
		}
		return result;
	}
}
