package array_day3_foreach;

public class WarmUp {

	public static void main(String[] args) {
		
		//// WARM UP TASK 
		/*
		 * create an array of 10 integer
		 * assign value for the array items
		 * find how many of those integer 
		 * is more than 5 and less than 10 
		 * 
		 * Your program should output 
		 * There is x number between 5 and 10
		 * */
		int count = 0 ;
		int[] numbers = {1,2,3,5,7,8888,5,9,0};
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]>5 && numbers[i]<10) {
				count++; //count+=1 ; 
				
			}
			
		}
		System.out.println("There is "+count+" number between 5 and 10");

	}

}
