package ITEXAMS;
// Question 28


class Vehicle{
	String type= "4W";
	int maxSpeed=100;
//	Vehicle(){	
//	}
	Vehicle(String type, int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed; 
	}
}

public class car extends Vehicle{
	String trans;
	car(String trans){
		super("",0);
		this.trans= trans;
	}
	
	car(String type, int maxSpeed, String trans){
		super(type, maxSpeed);
//		this(trans);
	}
	
	
}
