package OverLoaded;

import java.util.List;
//import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;;

public class question20 {
	int count;
	static int a;
	public void question20() {
		count=4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		question20 s = new question20();
//		System.out.println("Without method called  "+s.count+" "+question20.a);
//		s.question20();
//		System.out.println(s.count);
		StringBuilder sb = new StringBuilder();
		sb.append("a").append("b");
		System.out.println(sb);
		ArrayList<String> lst = new ArrayList<>();
		lst.add("a");
		System.out.println(lst);
		List<String> list= Arrays.asList("a","b");
		System.out.println("List is : "+list);
		String[] arr= list.toArray(new String[2]);
		System.out.println("arr is :"+ Arrays.toString(arr));
		
		LocalDate date = LocalDate.of(2014,Month.APRIL,21);
		System.out.println(date);
		
		System.out.println(10/0);
	}

}
