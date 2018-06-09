package ClothingStore;

public class Computer extends Electronics{
	int memory=10;
	
	static void doSomething() {
		System.out.println("do computer stuff");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	void printMemorySize() {
		System.out.println("From Computer "+ memory);
	}
	
	public static void main(String[] args) {
		Electronics e= new Computer();
		System.out.println(((Computer)e).memory);
		System.out.println(e);
		Computer.doSomething(); 
		e.doSomething(); 

		e.printMemorySize();
	}
}

class Electronics{
	int memory=100;
	
	static void doSomething() {
		System.out.println("do electronic stuff");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Electronics";
	}
	
	void printMemorySize() {
		System.out.println("From Electronics "+ memory);
	}
	
}
