package may192018;

public interface Edible {
	int NUM=10;
	void eat();
	default void drink() {
		System.out.println("Default drink in Edible");
	}
	
	static void doSomething() {
		System.out.println("Do sth in edible");
	}
	
}
