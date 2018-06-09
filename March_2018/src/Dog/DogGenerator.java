package Dog;

public class DogGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"name1","name2","name3","name4","name5"};
		int[] sizes = {5,10,15,20,25};
		
		Dog[] allDogs= new Dog[5];
		for(int i=0; i<allDogs.length; i++)
		{
			allDogs[i]= new Dog();
			allDogs[i].name= names[i];
			allDogs[i].size= sizes[i];
			allDogs[i].bark();
			
		}
		
	}

}

