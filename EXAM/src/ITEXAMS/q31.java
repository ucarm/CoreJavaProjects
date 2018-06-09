package ITEXAMS;

public class q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

class Vehicle1{
	int x;
	Vehicle1(){
		this(10);
	}
	Vehicle1(int x){
		this.x=x;
	}
}

class Car extends Vehicle1{
	int y;
	Car() {
//		super();
		this(20);
		
	}
	
	Car (int y){
//		super();
		this.y=y;
	}
	
	
}
