package readFilesWithExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileDataIntoaList {
	public static void main(String[] args) {
//		TRY-WITH Resources
//		This will automatically close the opened files
		ArrayList<Integer> lst= new ArrayList<>();
			try(FileReader fr = new FileReader("Numbers2.txt");
				BufferedReader br= new BufferedReader(fr); )
			{
				 
//				This is one way to read code from txt file
				while(br.ready()) {	
					try {
					Integer temp= Integer.valueOf(br.readLine());	
					lst.add(temp);
					}
					catch(NumberFormatException e) {
//						e.printStackTrace();
						System.out.println("Number format exception is handled.");
					}
//					System.out.println(temp);
				}
			}
			
			catch(IOException e){
				e.printStackTrace();
			}
			
			
			System.out.println(lst);
			System.out.println(lst.size());
			System.out.println(sum(lst));
			System.out.println(largest(lst));
			System.out.println(Unique(lst));
			System.out.println("number of unique numbers :" + Unique(lst).size());
			System.out.println(lst);
			System.out.println(numberOfElements(lst, 313));
			System.out.println(duplicates(lst));
			System.out.println("How many duplicates : "+duplicates(lst).size());
	}
	

	private static ArrayList<Integer> duplicates(ArrayList<Integer> lst) {
		// This method saves all duplicate values, and returns the duplicate numbers in a list
		ArrayList<Integer> l = new ArrayList<>();
	
		for (Integer i : lst) {
			if(numberOfElements(lst,i)>1 && !l.contains(i)) {
				l.add(i);
			}
		}
		
		return l;
		}
	
	
	
	private static int numberOfElements(ArrayList<Integer> lst, int in) {
		//this method will check how many in items we have in the given list lst
		int count=0;	
		for (int i=0; i<lst.size(); i++) {
				if(in==lst.get(i)) {
					count++;
					
				}
			}
		return count;
	}
	


	private static List<Integer> Unique(ArrayList<Integer> lst) {
		
		List<Integer> l = new ArrayList<>();
		for (Integer i : lst) {
			if(!l.contains(i))
				l.add(i);
		}
		
		return l;
	}


	private static int largest(ArrayList<Integer> lst) {
		// TODO Auto-generated method stub
//		int max=lst.get(0);
//		for (Integer integer : lst) {
//			if(integer>max)
//				max=integer;
//		}
		int max= Collections.max(lst);
		return max;
	}

	private static int sum(ArrayList<Integer> lst) {
		// TODO Auto-generated method stub
		int sum=0;
		for (Integer i : lst) {
			sum+=i;
		}
		return sum;
	}
}
