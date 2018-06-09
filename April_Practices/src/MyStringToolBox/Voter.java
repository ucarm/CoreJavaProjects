package MyStringToolBox;

public class Voter {
	
//	reate a class called Voter 
//
//	Add a static field called count 
//
	static int count;
	private String name;
	private int age;
	
	static int countOfGetNameCall;
	
	
//	add private instance field called name 
//
//	add private instance filed called age 
//
//	create getters for both instance field 
//
//	create constrcutor to set the name and age
//
//	Increase the count each time new Voter is created 


	public Voter(String name, int age) {
	
		this.name = name;
		this.age = age;
		count++;
	}
	
	public String getName() {
		countOfGetNameCall++;
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

	
	

}
