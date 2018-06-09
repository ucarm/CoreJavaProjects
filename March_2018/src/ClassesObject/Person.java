package ClassesObject;

public class Person {

	//attributes
	//name, age, gender
	
	String name;
	int age;
	char gender;
	
	//behavior
	//eat, read, run, sleep
	
	public void eat() {
		System.out.println(name +" is eating");
	}
	public void read() {
		//String result=name + " is reading and ";
		//if(gender=='M')
		//	result+="he is "+age+" years old";
		//else
		//	result+="she is "+age+" years old";
		//System.out.println(result);
		String result = (gender =='M') ? name + " is reading and he is "+age+ " years old" : (gender=='F') ? name + " is reading and she is "+age+ " years old" : "Invalid gender";
		System.out.println(result);
	}
	
	public char getInitial() {
		return name.charAt(0);
	}
	//folowing method works if the name has more than one word.eg Mehmet Ucar return MU as initial   
	public String getAllInitial() {
		String result=name.toUpperCase().substring(0, 1);
		for(int i=1; i<name.length()-1;i++)
			if(name.charAt(i)==' ')
				result+=name.charAt(i+1);
		return result;
	}
	public int getBirthYear() {
		// TODO Auto-generated method stub
		return 2018-age;
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+name);
		
	}
	public void goHome(String string, int i) {
		System.out.println("Go home "+ string +" address is "+ i);
	}
	public double addNumbers(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}
	
}
