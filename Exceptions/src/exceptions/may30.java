package exceptions;

public class may30 {

	public static void main(String[] args) {
		String a= null;
		try {
			System.out.println(reverse(a));
		}
		catch(NullPointerException e) {
			System.out.println("You have a null string");
		}
	}

	public static String reverse(String str) throws NullPointerException{
		if(str==null)
			throw new NullPointerException();
		StringBuilder sb= new StringBuilder(str);
		String str1= sb.reverse().toString();
		return str1;
	}
}
