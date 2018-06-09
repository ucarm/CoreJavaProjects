package WarmUpMay8;

public class Computer {
	 protected String ramType;
	 protected double storage;

	public Computer() {
		super();
	}
	
	public Computer(String ramType, double storage) {
		this.ramType=ramType;
		this.storage=storage;
	}
	
	protected void compute() {
		
	}
	
	protected void display() {
		System.out.println("Computer info\t:"
				+"Ram: "+ramType+ "--- Storage:"+storage);
	}
	
	
}
