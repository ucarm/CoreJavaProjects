package Animal;

public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
