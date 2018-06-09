package MyStringToolBox;

//Create Calculator class with 4 static methods 
//add , substarct , multiply and divide 
//all of will take two double parameters 
//and return the result 
//create a main method right inside and test your calculator


public class Calculator {
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double substract (double a, double b) {
		return a-b;
	}
	
	public static double multiply (double a, double b) {
		return a*b;
	}

	public static double divide (double a, double b) {
		return a/b;
	}
	
	public void printSomething() {
		System.out.println("Olalalalla");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.divide(5, 6));
		Calculator c= new Calculator();
		System.out.println(c.add(1, 1));
		
		 c= null;
		System.out.println(c.add(1, 7));
		c.printSomething();

		
	
	}

}
