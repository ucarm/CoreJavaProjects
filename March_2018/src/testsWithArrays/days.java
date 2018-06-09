package testsWithArrays;

import java.util.Random;

public class days {

	public static void main(String[] args) {
		Random rand = new Random(); 
		int[] num = new int[7]; 
		for(int i =0; i<num.length; i++)
			num[i]=rand.nextInt(7);
		int weekends=0;
		for(int day: num) { 
			
			switch(day) { 
				case 0: 
					System.out.println("Sunday"); 
					weekends++;
					break; 
				case 1: 
					System.out.println("monday"); 
					break;
				case 2: 
					System.out.println("tuesday"); 
					break; 
				case 3: 
					System.out.println("wednesday");
					break;
				case 4: 
					System.out.println("thursday"); 
					break; 
				case 5: 
					System.out.println("friday"); 
					break; 
				case 6: 
					System.out.println("saturday"); 
					weekends++;
					break;
				default: 
			} 
		}
		
		System.out.println("You have "+weekends+" weekend days.");
	}

}
