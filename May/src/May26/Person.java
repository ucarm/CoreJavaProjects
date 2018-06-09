package May26;

public class Person {
	 private String name;
	 private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1= new Person("Ali", 10);
//		Object p2= new Person("Mehmet", 45);
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
		Engineer e1 = new Engineer("Ekrem", 33,33);
		Person e2 = new Engineer("Esat Emin", 34,34);
		Object e3 = new Engineer("Vedat", 35,35);
		
		System.out.println(e1+"\n"+e2+"\n"+e3);
		e1.design("car exterior.");
		
		Engineer c1= (Engineer) e2;
		
		Object oo= new Person("Ekrem", 33);
		boolean b1= oo instanceof Person;
		boolean b2= oo instanceof Object;
		boolean b3= oo instanceof Cat;
		System.out.println(""+b1+b2+b3);
	}

}

class Engineer extends Person{
	int trainingID;

	public Engineer(String name, int age, int trainingID) {
		super(name, age);
		this.trainingID = trainingID;
	}

	public int getTrainingID() {
		return trainingID;
	}


	public void design(String design) {
		System.out.println("Designing "+design);
	}

	@Override
	public String toString() {
		return "Engineer [trainingID=" + trainingID + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}


	
}

class Cat{
	
}
