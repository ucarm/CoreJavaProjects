package MyStringToolBox;

public class VotingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter v1= new Voter("Adam",25);
		//Voter.count++;
		Voter v2= new Voter("Amanda",30);
		//Voter.count++;
		System.out.println("Voter count is : "+Voter.count);
		
		v1.getName();
		v2.getName();
		v1.getName();
		v1.getName();
		
		System.out.println("Voter getName count : "+ Voter.countOfGetNameCall);
		System.out.println("V1 getName count : "+ v1.countOfGetNameCall);
		
	}

}
