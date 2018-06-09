package Dog;

public class Dog {

	String name;
	int size;
	public void bark() {
		if(size>20)
			System.out.println(name+"Woof woof woof");
		else if(size>10)
			System.out.println(name+"ruff ruff");
		else
			System.out.println("No barking today");
	}
	
	public int play(String location) {
		if (location.toLowerCase().equals("park"))
			return 1;
		return 0;
	}
	
}


