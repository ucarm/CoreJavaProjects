package ArrayList;

import java.util.*;

public class ArrKist2 {

	private static Scanner scan;

	public static void main(String[] args) {
		//Create an ArrayList of string called name
		// add 5 names in a loop using scanner
		//then print all using the loop
		System.out.println("Enter 5 names");
		scan = new Scanner(System.in);
		List<String> names= new ArrayList<String>();
//		for(int i=0; i<5;i++) {
//			names.add(scan.next());
//		}
		
		names.add("Adam");
		names.add("Van");
		names.add("Adam");
		for (String a:names) {
			System.out.println(a+",");
		}
		
		for (String s : names) {
			System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
			
		}
		
		System.out.println(names.indexOf("Adam"));
		System.out.println(names.lastIndexOf("Adam"));

		for (int i =0; i<names.size();i++) {
			names.set(i, names.get(i).toUpperCase());
		}
		
		System.out.println(names);
		names.add(2, "ABC");		
		System.out.println(names);
		//names.remove("ADAM");
		for (int i = 0; i < names.size(); i++)
			if(names.get(i).equals("ADAM"))
				names.remove(i);
			
		
		System.out.println(names);
		
		//
	}

}
