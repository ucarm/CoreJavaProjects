package WarmUpMay8;

public class Teacher extends Person{
	int teacherID;
	
	public Teacher() {}
	
	public Teacher(int age, String name, int teacherID) {
		super(name,age);
		this.teacherID = teacherID;
	}


	public void teach(String subject) {
		System.out.println("Teacher teaches "+subject);
	}
	
	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", name=" + name + ", age=" + age + "]";
	}

	void eat() {
		System.out.println("Teacher is eating");
	}
	
	public static void main(String[] args) {
		Person person1= new Person();
		Teacher teacher1= new Teacher();
		System.out.println("teacher age:"+teacher1.age);
		System.out.println();
		System.out.println(teacher1);
		System.out.println();
		System.out.println(person1);
		person1.eat();
		teacher1.eat();
		Person ali = new Teacher(1,"Ali",49);
		System.out.println(ali);
//		Teacher veli= new Person();
		
	}
	
}
