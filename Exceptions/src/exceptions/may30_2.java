package exceptions;

public class may30_2 {
	public static void main(String[] args) {
		System.out.println("Beginning");
		
		try {
			throw new RuntimeException();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("OK. U caught an exception");
		}
		
//		try{
//			for(int i=0; i<100; i++ ) {
//				System.out.println(i);
//				Thread.sleep(100);
//			}
//		}
//		catch(InterruptedException e) {
//			System.out.println("Interrupted");
//		}
		
		System.out.println("end");
	}
}
