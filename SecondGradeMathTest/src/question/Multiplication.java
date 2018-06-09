package question;

public class Multiplication extends Question {


	public Multiplication(Range r) {
		super("Multiplication","*");
		operand1=RandomNumber.getRandomInteger(r);
		operand2=RandomNumber.getRandomInteger(r);
	
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		calculated = true;
		answer= operand1*operand2;
	}
	@Override
	public String toString() {
		if(!calculated)
			return operand1+"*"+operand2+"=";
		return operand1+"*"+operand2+"="+answer;
	}
}
