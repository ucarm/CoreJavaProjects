package arrays_day2;

public class SearhItemInArray {

	public static void main(String[] args) {
		
		String[] products = new String[] {"apple","banana","pear","bread","pie"};

		for (int i = 0; i < products.length; i++) {
			
			if (products[i].equals("pear") ) {
				System.out.println("Bingo Pear is found at Location :"+i);
				break;
			}
			
		}
		/// print out the location of products + product name that have letter p
		/// str.contain("your str here")
		
		
	}

}
