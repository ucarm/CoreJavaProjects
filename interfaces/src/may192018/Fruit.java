package may192018;

public class Fruit implements Edible, Drinklable{
	
	public static final int NUM=15;
	
	public static void main(String[] args) {
		System.out.println(NUM);
		System.out.println(Edible.NUM);
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat is implemented");
	}
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		Drinklable.super.drink();
	}

	static void doSomething() {
		
	}
	

}
