package WarmUpMay8;

public class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("Person is eating");
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
