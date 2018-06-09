package Practices;

public class InstancePractice {

	public final int num;
	
	int num1;
	int num2;
	
	static {
		System.out.println("Static block");
	}
	
	{
		num=123;
		System.out.println("Instance block");
	}
	
	public InstancePractice() {
		System.out.println("no arg constructor");
	}
	
	public InstancePractice(int i, int j) {
		this.num1=i;
		this.num2=j;
		System.out.println("2 args constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Started");
		InstancePractice i1 = new InstancePractice();
		InstancePractice i2= new InstancePractice();
		InstancePractice i3= new InstancePractice(10,20);


		System.out.println("Main Ended");

	}

}
