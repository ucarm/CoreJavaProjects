package MathEquation;

public class Apple extends Fruit{

	// public --> everywhere
	// private --> same class
	// default --> package private: only accessible in the same package
	
	public  Apple() {
		super();
		System.out.println("apple no arg");
	}
	
//	public void  Apple() {
//		System.out.println("apple no arg");
//	}
	
	public void slice() {
		System.out.println("Slicing");
	}
	
	public static void main(String[] args) {
		Apple a = new Apple();
		a.slice();
	}
	
	public String toString() {
		return "an apple is here..."+super.count;
	}

}
