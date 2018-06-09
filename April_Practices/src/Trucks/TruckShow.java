package Trucks;

import java.util.*;

public class TruckShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Truck t1= new Truck("Monster Truck 1", 2015, 10001);
			Truck t2= new Truck("Monster Truck 2", 2016, 10002);
			Truck t3= new Truck("Monster Truck 3", 2017, 10003);
			Truck t4= new Truck("Monster Truck 4", 2018, 10004);
			Truck t5= new Truck("Monster Truck 5", 2019, 10005);
			
			List<Truck> list = Arrays.asList(t1,t2,t3,t4,t5);
			list.add(new Truck("Monster Truck 6", 2005, 500));
			
			for (int i = 0; i < list.size(); i++) {
				Truck each = list.get(i);
				System.out.println(each);
			}
	}

}
