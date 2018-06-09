package OverLoaded;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSomething(15L);
		doSomething(new Long(12L));

		doSomething(new Long("1212121"));
	}
	
	static void doSomething(long l) {
		System.out.println("a primitive long");
	}
	
	static void doSomething(Long l) {
		System.out.println("Wrapper long");
	}
	
	static void doSomething(Integer i) {
		System.out.println("Wrapper Integer");
	}
	
}
