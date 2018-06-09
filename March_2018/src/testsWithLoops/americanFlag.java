package testsWithLoops;

public class americanFlag {
	public static void main(String[] arg) {
		String str= ""; // create a string
		for(int i=0; i<16; i++)for(int j=0; j<45; j++) // two nested loops i for rows, j for columns
			str+= j!=44 ? (i<8 && j<15 ? (i+j)%2==0 ? " ": "*" :"="): "\n"; // two nested if statements to place "*"," ","=" and "\n"    
		System.out.println(str);
	}
}
