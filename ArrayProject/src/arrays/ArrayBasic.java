package arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		// Be careful , bear shouldnt ingest large fluffy dog 
		// 
		char[] chars = new char[2] ; 
		//System.out.println(chars[0]);
		int num1 = 12 ; 
		int[] nums = new int[3]; 
		
		long[] longNums = new long[16];
		longNums[0] = 4 ; 
		longNums[1] = 14 ; 
		longNums[2] = 24 ; 
		longNums[3] = 34 ; 
		longNums[4] = 44 ; 
		
		System.out.println(longNums.length);
		
		for (int i = 0; i < longNums.length; i++) {
			System.out.println("item number : " + (i+1) +"--"+  longNums[i]);
		}
		
//		System.out.println(longNums[0]);
//		System.out.println(longNums[1]);
//		System.out.println(longNums[2]);
//		System.out.println(longNums[3]);
//		System.out.println(longNums[4]);
		
		
		
		
		
		
		
		
	}

}
