package may9WarmUp;
import java.time.LocalDate;
import java.util.ArrayList;

import may9WarmUpV2.*;


public class PhoneActivity {

	public static void main(String[] args) {
		CellPhone cell= new CellPhone("Apple", 10);
		LandLine land = new LandLine();
		System.out.println(cell.getBrand()+cell.getSize());
		System.out.println(land.getBrand()+land.getSize());
		int i=5;
		float m= i;
		System.out.println(m);
		Integer [] arr= new Integer[0];
		
		LocalDate date = LocalDate.of(2018, 4, 30);
		System.out.println(date);
		
		ArrayList<Integer> lst=  new ArrayList<Integer>();
		lst.add(1);
		lst.add(null);
		System.out.println(lst);
		for(Integer k: lst) {
			System.out.println(k);
		}
		
		
		
	}

}
