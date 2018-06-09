package Practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ChapterTests14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a= false+"";
//		System.out.println();
//		long x=10;
//		x=x++;
//		int n=0;
//		String str = n+1+"";
//		System.out.println(str);
//		System.out.println(str=="1");
//		
//		ArrayList<String> a1= new ArrayList();
//		a1.add("1");
//		ArrayList a2= new ArrayList();
//		a2.add(1);
//		a2.add("2");
//		System.out.println(a1.equals(a2));
//		System.out.println(a2);
		
		LocalDate date = LocalDate.parse("2018-04-30");
		date=date.plusDays(2);
		System.out.println(date);
		
	}

}
