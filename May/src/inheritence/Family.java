package inheritence;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent dad = new Parent();
		dad.name="Dady";
		dad.sayName();
		
		Child son = new Child();
		son.name= "Sonny";
		son.sayName();
		
		Animal cheetah = new Animal();
		cheetah.setName("Cheetah");
		System.out.println(cheetah.toString());
		
		Pet pet= new Pet();
		pet.setName("Doodey");
		System.out.println(pet.toString());
		
		Dog puppy = new Dog();
		puppy.setName("cooper");
		System.out.println(puppy.toString());
		
	}

}
