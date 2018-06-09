package ArrayList;

import java.util.*;

public class Arrlist {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Classroom Students List in Arraylist");
//		ArrayList<String> studentList = new ArrayList<String>();
//		scan = new Scanner(System.in);
//		int i =0;
//		while(true) {
//			i++;
//			System.out.print("Enter the name for Student #"+i+" (-1 to exit): ");
//			String temp= scan.next();
//				if(temp.equals("-1"))
//					break;
//			else
//				studentList.add(temp);
//		}
//		System.out.println(studentList);
//		System.out.println(studentList.get(studentList.size()-1));
		String str= "DDABCDEFGVDD";
		StringBuilder sb= new StringBuilder(str);
		//1. delete the first and last DD occurances
		int i1 = sb.indexOf("D");
		sb.deleteCharAt(i1);
		System.out.println(sb);
		int i2= sb.lastIndexOf("D");
		sb.deleteCharAt(i2);
		System.out.println(sb);

		//2. change the 1st occurance of D to K
		int D= sb.indexOf("D");
		sb.setCharAt(D, 'K');
		//sb.replace(D, D+1, "D");
		
		//3- insert ivtory after V
		
		int iV = sb.indexOf("V");
		sb.insert(iV+1, "ictory");
		
		System.out.println(sb);
		//4- find out the char at index 4
		
		System.out.println(sb.charAt(4));
		
		
		
	}

}
