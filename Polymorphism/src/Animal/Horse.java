package Animal;

public class Horse extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Horse is eating");
	}
	
	
	
	@Override
	public String toString() {
		return "Horse [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		
		Horse h1= new Horse();
		Animal a1= new Horse();
		Mammal m1= new Horse();
		Animal a2= h1;
		Object o1= new Horse();
		
		
		h1.eat();
		a1.eat();
		m1.eat();
		a2.eat();
		
		((Horse)o1).eat();
		((Animal)o1).eat();
		
		Animal [] farmAnimals = new Animal[3];
		farmAnimals[0]= new Dog();
		farmAnimals[1]= new Horse();
		farmAnimals[2]= new Cat();
		
		for (Animal each : farmAnimals) {
			each.eat();
		}

		
	}
}
