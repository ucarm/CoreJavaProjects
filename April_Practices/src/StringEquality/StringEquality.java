package StringEquality;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLiteral= "ABC"; // saved into string pool in memory
		String other = new String ("ABC");// saved into heap (Main Memory)
		String anotherLiteral = "ABC"; // saved into String pool in memory
		
		System.out.println(strLiteral == anotherLiteral);
		System.out.println(strLiteral == other);

	}

}
