package OverLoaded;

public class OverLoadedCalculator {
	private int number;
	
	public int getNumber() {
		return this.number;
	}
	
	public int add(int a) {
		this.number+=a;
		return getNumber();
	}
	public void add(double a, float b) {
		a+= b;
		System.out.println(a);
	}
	public int add(int[] numbers) {
		int sum=0;
		for (int number: numbers) {
			sum+=number;
		}
		return sum;
	}
	
	// new method take long array
	// and add all numbers until any item is less than 20 
	// return sum 
	public long add(long [] longs) {
		int sum=0;
		for (long a: longs){
			if (a<20) 
				break;
			else
				sum+=a;
		}
		return sum;
	}
	
	
	public static void main(String... args) {
		OverLoadedCalculator c1 = new OverLoadedCalculator();
		int an1= c1.add(55);
		System.out.println(an1);
		
		c1.add(1.1, 2.2f);
		System.out.println(c1.add(new int[] {1,2,3,4,5,66,7,8,9,10}));
		
		System.out.println(c1.add(new long [] {30,50,40,60,70,10,20}));
		
	}
	
}
