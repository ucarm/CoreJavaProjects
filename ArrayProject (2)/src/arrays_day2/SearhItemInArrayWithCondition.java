package arrays_day2;

public class SearhItemInArrayWithCondition {

	public static void main(String[] args) {
		
		String[] products = new String[] {"apple","banana","pear","bread","pie"};

		for (int i = 0; i < products.length; i++) {
			
			if(products[i].contains("p")==true) {
				System.out.println("item "+products[i]+" found at Location :"+i);
			}
			
			
		}
		/// print out the location of products + product name that have letter p
		/// str.contain("your str here")
		
		
	}

}
