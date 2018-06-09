package ProjectManager;

public class projectManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h1= new House();
		House h2= new House(123);
		House h3= new House("MyHouse",111,100.0);
		
		System.out.println(h1.getHouseNumber());
		System.out.println(h2.getHouseNumber());
		System.out.println(h3.getHouseNumber());
		
		House.neighborhood="WoodBridge";
		System.out.println(h1.neighborhood);
		
		h3.neighborhood="Aliana";
		System.out.println(House.neighborhood);
		
		
		
		
		
	}

}
