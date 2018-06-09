package SundayMay6;

import java.util.ArrayList;

public class Sum {

	
	public int sumIt(int a, int b) {
		return a+b;
	}
	public int sumIt(int a, int b, int c) {
		return a+b+c;
	}
	
	public int sumIt(int[] a) {
		int sum=0;
		for (int temp : a)
			sum+=temp;
		return sum;
	}
	
	public int sumIt(ArrayList<Integer> a) {
		int sum=0;
		for (int temp : a)
			sum+=temp;
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(5);
		numsList.add(10);
		numsList.add(15);

		if(sum.sumIt(numsList) == 30) {
		  System.out.println("Pass: sumIt(ArrayList<Integer>) working as expected");
		}else {

		  System.out.println("Fail: sumIt(ArrayList<Integer>) is NOT working as expected");

		}




	}

}
