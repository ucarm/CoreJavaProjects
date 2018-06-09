package array_day3_foreach;

public class SplittingString {

	public static void main(String[] args) {
		
		String str = "I love Java";
		String[] strArr = str.split("a");
		for(String word: strArr) {
			System.out.println("my word is : <"+word+">");
		}
		
		/*
		 * split with space to get word array
		 * use 4 different type of loop you learned so far 
		 * to iterate over each word
		 * your output should be "Today have 5 characters" and so on
		 * start with for each loop
		 * USE FOR EACH LOOP TO SOLVE THE PROBLEM 
		 * USE FOR LOOP TO SOLVE THE PROBLEM 
		 * USE WHILE LOOP AND DO WHILE LOOP TO SOLVE THE PROBLEM 
		 * YOU WILL HAVE 4 SAME OUTPUT FROM 4 DIFFERENT LOOP TYPE
		 * 
		 * */
		String strs = "Today I learned Java For Each Loop";
		String[] myArray = strs.split(" ");
		System.out.println("FOR EACH LOOP ");
		for(String word: myArray ) {
			System.out.println("word <"+ word + "> has "+ word.length() + ": char");
		}
		
		System.out.println("FOR LOOP ");
		for(int i=0 ; i< myArray.length ; i++) {
			System.out.println("word <"+ myArray[i] + "> has "+ myArray[i].length() + ": char");	
		}
		
		System.out.println("WHILE LOOP ");
		int j = 0 ; 
		while(j< myArray.length) {
			System.out.println("word <"+ myArray[j] + "> has "+ myArray[j].length() + ": char");	
			j++;
		}
		
		System.out.println("DO WHILE LOOP ");
		int k = 0 ; 
		do {
			System.out.println("word <"+ myArray[k] + "> has "+ myArray[k].length() + ": char");	
			k++ ; 
		}while(k< myArray.length) ; 
		

	}

}
