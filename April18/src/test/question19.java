package test;

import java.util.ArrayList;
import java.util.Arrays;

public class question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"a","a"};
		String[] s2= {"a","a"};
		System.out.println("sa1==sa2\t"+s1.equals(s2));
		System.out.println("sa1.equals(sa2)\t"+ (s1==s2));
		
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("a");
		
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("a");
		
		System.out.println("al1==al2\t"+(al1==al2));
		System.out.println("al1.equals(al2)\t"+al1.equals(al2));
		
		String x1="a ";
		String x2="a";
//		x2=x2.trim();
		x1=x1.trim();
		System.out.println("x1==x2\t\t"+(x1==x2));
		
		System.out.println("x1.equals(x2)\t"+x1.equals(x2));
		
		Integer arrays[]= new Integer[5];
		System.out.println(arrays);
		
		int[] numbers = new int []  {3,4,5,6};
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		Integer m= new Integer(5);
		System.out.println(m);
		
//		String name= "Rasul";
//		
//		StringBuilder namesb= new StringBuilder();
//		namesb.append(name);
//		System.out.println(namesb);
//		System.out.println(namesb.reverse());
//		System.out.println(namesb);
//		
//		while(true) {
//			name+="a";
//			System.out.println(name);
//			if(name.equals("Rasulaaaaaaaaaa"))
//				break;
//		}
//		
		
		int a = Integer.valueOf("50");
		int b = Integer.parseInt("50");
		Integer c= new Integer(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b==c);
	}

}
