package ClassesObject;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
		p1.name= "Adam";
		p1.age=20;
		p1.gender= 'M';
		
		System.out.println(p1.name);
		
		//Task 1
		
		Person p2= new Person();
		p2.name= "Ekrem Vedat Ucar ";
		p2.age=31;
		p2.gender='M';
		System.out.println("This person has a name of "+p2.name);
		System.out.println("and (s)he is "+p2.age+" years old, "
				+ "and her/his gender is "+p2.gender+".");
		p2.eat();
		p2.read();
		
		Scanner scan = new Scanner(System.in);
		//String str = scan.next();
		System.out.println(p2.getInitial());
		System.out.println(p2.getAllInitial());
		System.out.println(p2.getBirthYear());
		p2.sayHello(p2.name);
		p2.goHome("mehmet", 123);
		System.out.println(p2.addNumbers(10.0, 100.0));
	}

	

}
