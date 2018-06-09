package MultiArray;

public class PizzaShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pizza = new int[7][3];

		for (int i = 0; i < pizza.length; i++) {
			for (int j = 0; j < pizza[i].length; j++) {
				pizza[i][j] = i * 10 + j % 3;

			}

		}

		// System.out.println(pizza[1][0]);

		for (int i = 0; i < pizza.length; i++) {
			System.out.print("Slice " + i + " :");
			for (int j = 0; j < pizza[i].length; j++) {
				System.out.print("\tBite " + (j + 1) + ",");
				

			}
			System.out.println();

		}

	}

}
