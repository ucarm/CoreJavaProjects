package Rocket;

public class Rocket {
	private int power;
	private String name;
	private int numberOfEngine;
	private boolean readyForlaunch;
	
	static int counter;
	static String LaunchPad="Ucar";
	
	
	public Rocket(int power, String name, int numberOfEngine, boolean readyForlaunch) {
		//super();
		this.power = power;
		this.name = name;
		this.numberOfEngine = numberOfEngine;
		this.readyForlaunch = readyForlaunch;
		counter++;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEngine() {
		return numberOfEngine;
	}
	public void setNumberOfEngine(int numberOfEngine) {
		this.numberOfEngine = numberOfEngine;
	}
	public boolean isReadyForlaunch() {
		return readyForlaunch;
	}
	public void setReadyForlaunch(boolean readyForlaunch) {
		this.readyForlaunch = readyForlaunch;
	}
	
	public static void capsulate() {
		System.out.println("Reducing the weight..");
		counter++;
	} 
	
	@Override
	public String toString() {
		return "Rocket [power=" + power + ", name=" + name + ", numberOfEngine=" + numberOfEngine + ", readyForlaunch="
				+ readyForlaunch + "]";
	}
	public void launch() {
		System.out.println("launching "+ toString());
	}
	
	
	
	
}
