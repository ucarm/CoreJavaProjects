package MathEquation;

public class CalculatorEngine {

/*	Create a class called MathEquation 
	Create 4 private  instance variables 
	 	leftVal as double;
	 	rightVal as double
		opCode as char;
		result as double;
		Create Getter and Setter for first 3 fields 
	Create constructors : 
	      Create one argument constructor to set the value for opCode
	      Create 3 arguments constructor to set the value for opCode, leftVal, rightVal
	      Create just getter for result. 
	Create a method called execute , take no parameter return nothing , logic as below 
	      if opCode is 'a' add 2 numbers and set the result field value 
	      if opCode is 's' subtract 2 numbers and set the result field value 
	      if opCode is 'm' multiply 2 numbers and set the result field value 
	      if opCode is 'd' divide 2 numbers and set the result field value 
	     if nothing match result field will be 0; 
	Create a class called CalculatorEngine with main method 
	     Create 4 MathEquation instances with all 3 field value set
	     Create an array to store these 4 MathEquation instances 
	     Loop through it and print out the result of your operation*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=2;
		
		System.out.println("Working with number : "+num1+" , "+num2);
		
		MathEquation me1 = new MathEquation('a', num1, num2);
		MathEquation me2 = new MathEquation('s', num1, num2);
		MathEquation me3 = new MathEquation('m', num1, num2);
		MathEquation me4 = new MathEquation('d', num1, num2);
		MathEquation me5 = new MathEquation('z', num1, num2);
		
		MathEquation[] equationArr = {me1, me2, me3, me4,me5};
		
		for (MathEquation each : equationArr) {
			
			each.execute();
			System.out.println("The opCode is : " + each.getOpCode() + 
			          "| Result is : " + each.getResult() );
			
		}
		// me5 object change the opCode to substract
		
		me5.setOpCode('s');
		me5.execute();
		System.out.println("result is :"+ me5.getResult());
		
		//me1.execute();
		
	}

}
