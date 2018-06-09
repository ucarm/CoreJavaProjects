package Dog;

public class DogTester {

	public static void main(String[] args) {

		
		Dog d1= new Dog();
		d1.name="karabas";
		d1.size=15;
		Dog d2= new Dog();
		d2.name="boncuk";
		d2.size=21;
		Dog d3= new Dog();
		d3.name="cikolata";
		d3.size=10;
		
		System.out.println("Dog one is "+ d1.name+" play : "+d1.play("park"));
		d1.bark();
	

		System.out.println("Dog 2 is "+ d2.name+" play : "+d2.play("school"));
		d2.bark();
		

		System.out.println("Dog 3 is "+ d2.name+" play : "+d3.play("PARK"));
		d3.bark();
		
		String[] names= {"abc","def"};
		Dog[] manyDogs= new Dog[3];
		manyDogs[0]=d1;
		manyDogs[1]= new Dog();
		manyDogs[2]=d3;
		
		for(int i=0; i<manyDogs.length; i++)
			manyDogs[i].bark();
	
		Dog[] manyDogs1= new Dog[] {d1,d3};
		Dog[] manyDogs2= {d1,d3,new Dog()};
		
		
	}

}
