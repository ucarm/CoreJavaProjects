package Clock;

public class Clock implements TimeTeller{

		static boolean CAN_TELL_TIME= false;
		int k=10;
		
		@Override
		public void tellTime() {
			System.out.println("Telling time");
		}
		void run() {
			System.out.println("Clcok is Running ");
		}
		
		public void speak() {
			System.out.println("Speak from Clock");
		}
		
		public static void main(String[] args) {
//			Clock c= new Clock();	
			TimeTeller c= new Clock();
			System.out.println(CAN_TELL_TIME);
			System.out.println(TimeTeller.CAN_TELL_TIME);
			c.tellTime();
//			c.run();	
			System.out.println(c.k);
			c.speak();
		}
}

interface TimeTeller{
	int k=100;
	boolean CAN_TELL_TIME= true;
	void tellTime();
	
	default void speak() {
		System.out.println("Sreak from TimeTeller");
	}
}