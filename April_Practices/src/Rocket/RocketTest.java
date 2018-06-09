package Rocket;

public class RocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rocket r1= new Rocket(100,"SpaceX",24, false);
		Rocket r2= new Rocket(120,"Apollo",21, true);
		
		r1.launch();
		r2.launch();
		
		System.out.println(Rocket.LaunchPad);
		System.out.println(Rocket.counter);
		
		Rocket.capsulate();
		System.out.println(Rocket.counter);

	}

}
