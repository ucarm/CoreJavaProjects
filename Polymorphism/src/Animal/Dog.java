package Animal;

public class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
