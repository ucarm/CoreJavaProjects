package exceptions;

public class trycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin ...");
		String str= null;
		
		try{
			str.concat("");
		}
		catch(NullPointerException e) {
			System.out.println(e);
			try {
			System.out.println(6/0);
			}
			catch(ArithmeticException e1) {
				System.out.println(e1);
			}
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
	
		System.out.println("Done ...");
	}

}
