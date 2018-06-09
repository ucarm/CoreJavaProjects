package FourDimentional;

public class FourDimentionalTest {

	public static void main(String[] args) {

		int[][][][] fourD;
		long[][][] threeD = new long[4][3][2];

		double[][] priceTags = new double[3][];
		priceTags[0] = new double[] { 1.2, 12, 3, 4 };
		priceTags[1] = new double[] { 2.2, 32, 13, 24 };
		priceTags[2] = new double[] { 77 };

		double[][] priceTags1 = { { 1.2, 12, 3, 4 }, { 2.2, 32, 13, 24 }, { 77 } };

		// System.out.println( Arrays.toString(priceTags) );
		// System.out.println( Arrays.deepToString(priceTags) ) ;
		for (int i = 0; i < priceTags.length; i++) {
			// level 1 have X items and prices are 1.1 , 2,2 , 333......
			System.out.print("level " + (i + 1) + " have " + priceTags[i].length + " Items , they are: ");
			for (int j = 0; j < priceTags[i].length; j++) {
				System.out.print(priceTags[i][j] + " ");
			}
			System.out.println();
		}
	System.out.println("\nWith for each");
	for(double[] a: priceTags1) {
		for (double b:a)
			System.out.print(b+"\t");
		System.out.println();
	}
		
		
	
	}

}
