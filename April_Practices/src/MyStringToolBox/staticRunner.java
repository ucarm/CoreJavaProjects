package MyStringToolBox;

public class staticRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
		p1.name= "ali";
		Person.spicies="Human";
		
		Person p2=new Person();
		p2.name="veli";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		System.out.println(Person.spicies);
		System.out.println(p2.spicies);
		
		p2.spicies="Animal";
		
		System.out.println(p2.spicies);
		System.out.println(Person.spicies);
		
		
		System.out.println("Static method access");
		staticPractice sp1= new staticPractice();
		sp1.printMessage();
		staticPractice.printMessage();
		
	}

}
