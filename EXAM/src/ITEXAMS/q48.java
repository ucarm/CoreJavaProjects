package ITEXAMS;

import java.util.ArrayList;

public class q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch(RuntimeException re){
			System.out.println("Caught a runtimeException");
		}
		catch(Exception e){
			System.out.println("Caught an exception");
			
		}
		
		System.out.println("Ready to use");
	}

}
