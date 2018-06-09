package testsWithArrays;

import java.util.Arrays;
import java.util.Random;

public class arrays_17_3_2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		int[] days= new int[7];
		
		for(int i=0; i<days.length; i++) {
			days[i]=r.nextInt(7);
		}
		String result="";
		
		
		System.out.println(Arrays.toString(days));
		
		
		
		
	}

}
