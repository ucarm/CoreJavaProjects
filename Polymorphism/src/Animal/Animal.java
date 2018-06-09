package Animal;

public class Animal implements Mammal{
	String name;
	int age;

	@Override
	public void eat() {
		System.out.println("Animal is eating");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}
