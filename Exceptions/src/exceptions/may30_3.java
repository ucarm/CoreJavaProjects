package exceptions;

public class may30_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			playWithFire();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Fire caught");
			e.printStackTrace();
		}
		
		playWithWater();// cuz it is a unchecked exception
	}
	
	static void playWithFire() throws Exception {
		System.out.println("Play with fire");
		throw new Exception();
	}
	
	static void playWithWater() throws RuntimeException{
		System.out.println();

	}
}
