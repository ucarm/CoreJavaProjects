package instancePractice;

public class utilityTest {

	//
	
	public static void main(String[] args) {
		MyUtility my = new MyUtility();
		System.out.println(my.asciiVal('k'));
		// 
		System.out.println(my.asciiTable(32, 126));
		System.out.println(my.displayEachCharAsciiNumber("Mehmet"));
		String result="";
		result+="\n100 is \t: "+my.getChar(100);
		result+="\nI Love Java : \t: "+my.printOnlyAtoZ("I Love Java");
		System.out.println(result);
	}

}
