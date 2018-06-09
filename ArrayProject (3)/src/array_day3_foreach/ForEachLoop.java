package array_day3_foreach;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,5,6,8};
		System.out.println("using for loop ");
		for (int i = 0; i < numbers.length; i++) {		
			int eachNum = numbers[i];
			System.out.print(eachNum + " ");		
		}
		//System.out.println();
		System.out.println("using for each loop ");
		for(int eachNum : numbers ) {
			System.out.print(eachNum + " ");
		}
		// Task 3 create a long array  
		// assign it's value 
		// iterate over each item using for each loop 
		long[] longnums = {1122112321,3213,12323,232,12321};
		for (long l : longnums) {
			System.out.println(l);
		}


	}

}
