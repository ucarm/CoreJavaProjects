package arrays_day2;

import java.util.Arrays;

public class ReversingAnArray {

	public static void main(String[] args) {
		
		int[] nums = {12,32,53,74}; 
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		/*
		 * iteration 1  --- i=0  arr[3]= arr[] 
		 * iteration 2  --- i=1 
		 * iteration 3  --- i=2 
		 * iteration 4  --- i=3
		 * 
		 * nums.length--->> return the count of an array
		 * */	
		System.out.println("reversed");
		
		for(int i= nums.length-1 ; i>=0 ; i--) {
			System.out.print(nums[i] + " ");
		}
		/*
		 * iteration 1  --- i=3 
		 * iteration 2  --- i=2 
		 * iteration 3  --- i=1 
		 * iteration 4  --- i=0
		 * 
		 * nums.length--->> return the count of an array
		 * */	
			
		int[] moreNums = {12,32,53,74,99}; 
		for (int i = 0; i < moreNums.length/2; i++) {
			int temp = moreNums[i];
			moreNums[i] = moreNums[moreNums.length-1-i];
			moreNums[moreNums.length-1-i] = temp ;
			//System.out.print(nums[i] + " ");
		}
		System.out.println(Arrays.toString(moreNums));

	}

}
