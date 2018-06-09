package ITEXAMS;

public class q21 {
	public static void main(String[] args) {
		String str1= "java";
		char str2[] = {'J','a','v','a'};
		String str3= null;
		for (char c : str2) {
			str3 = str3+c;
		}
		if(str1.equals(str3))
			System.out.println("Success");
		else
			System.out.println("Unsuccess");
		
	}
}
