package MultiArray;

public class PizzaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pizza= 	{
								{"topping1","topping2","topping3"},
								{"topping4","topping5","topping6"},
								{"topping7","topping8","topping9"},
								{"topping11","topping11","topping12"},
								{"topping13","topping14","topping15"},
								{"topping16","topping17","topping18"},
								{"topping11","topping20","topping21"},
							};
		OUTER:
		for (int i = 0; i < pizza.length; i++) {
			System.out.print("Slice "+(i+1)+" Toppings are : ");
			INNER:
			for (int j = 0; j < pizza[i].length; j++) {
				if(pizza[i][j].equals("topping2"))
					break INNER;
				
				else if(pizza[i][j].equals("topping14"))
					continue INNER;
				
				else if(pizza[i][j].equals("topping11")) {
					System.out.println();
					continue OUTER;
				}
				
				System.out.print(pizza[i][j]+", ");
				
			}
			System.out.println();
		}
		
		
	}

}
