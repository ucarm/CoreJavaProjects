package shopping;

import java.util.ArrayList;

public class Catalog1 {
	
	 public ArrayList<String> items ;
	 public ArrayList<Double> prices ; 
	 public ArrayList<Double> monthlyPayments ;

	 public Catalog1() {
		 this.items = new ArrayList<>();
		 this.prices = new ArrayList<>();
		 this.monthlyPayments = new ArrayList<>();
		 loadWholeCatalog();
	 }
	
	/**
	 * This method adds all listed items to <items> arraylist
	 * that is already declared above
	 */
	public void loadItems() {
		//TODO
		
      /*	
        "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */	
	
		String[] itemsAll= new String[] {"iPhone 6s","iPhone 6s Plus","iPhone X","MacbookPro","ThumbDrive","Beats HeadPhones","Mouse","Charger","iPad","Dyson Vacuum","TV","Apple Watch"};
		for(int i=0; i<itemsAll.length; i++) {
			items.add(itemsAll[i]);
		}
		
	
	}
	/**
	 * This method adds all listed prices to <prices> arraylist
	 * that is already declared above
	 */
	public void loadPrices() {
		//TODO
				
		/*449.0
		  549.0
		  1149.0
		  1499.99
		  39.99
		  349.99
		  79.99
		  39.99
		  429.0
		  399.0
		  2199.0
		  559.0
		 */

		double[] pricesAll= new double[] {449.0,549.0,1149.0,1499.99,39.99,349.99,79.99,39.99,429.0,399.0,2199.0,559.0};
		for(int i=0; i<pricesAll.length; i++) {
			prices.add(pricesAll[i]);
		}
		
	}
	
	/**
	 * This method adds all listed monthly payments to <monthlyPayments> arraylist
	 * that is already declared above
	 */
	
	public void loadMonthlyPayments() {
		//TODO
		
		/*
		  {18.71,22.88,56.16,79.49,2.68,15.12,8.98,4.56,18.31,16.25,89.49,21.18}
		  */

		double[] monthly= new double[] {18.71,22.88,56.16,79.49,2.68,15.12,8.98,4.56,18.31,16.25,89.49,21.18};
		for (int i = 0; i < monthly.length; i++) {
			monthlyPayments.add(monthly[i]);
		}
	}
	
	/**
	 * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
	 * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
	 */
	public void loadWholeCatalog() {
		//TODO
		loadPrices();
		loadMonthlyPayments();
		loadItems();
		
	}

	/**
	 * Write a method that reads values from above ArrayLists and 
	 * returns a stringbuilder with all item details:
	 * return format:
	 * 		iPhone 6s-449.0-18.71
			iPhone 6s Plus-549.0-22.88
			..
	 * 
	 */
	
	
	public StringBuilder getWholeCatalog() {

		StringBuilder catalog= new StringBuilder();
		for(int i= 0; i<items.size(); i++) {
			catalog.append(items.get(i)+"-");
			catalog.append(prices.get(i)+"-");
			catalog.append(monthlyPayments.get(i)+"\n");
		}
				
		return catalog ;
	}

//	public StringBuilder getWholeCatalog() {
//
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < items.size(); i++) {
//            sb.append(items.get(i)).append("-");
//            sb.append(prices.get(i)).append("-");
//            sb.append(monthlyPayments.get(i)).append("\n");
//        }
//        return sb;
//    }
//	
	
	/**
	 * write a method that an item name and returns all details for it. If item
	 * is not in the list then returns null
	 *  ex: 
	 * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68 
	 * getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		
		//TODO
		for(int i=0; i<items.size();i++) {
			if(items.get(i).toString().equals(item)) {
				return item+"-"+prices.get(i)+"-"+ monthlyPayments.get(i);
			}
		}
		
		return null;
	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * 										  Charger-39.99-4.56 
	 * getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		ArrayList<String> result= new ArrayList<>();
		for(int i=0; i<monthlyPayments.size(); i++) {
			if(monthlyPayments.get(i)<price) {
				result.add(getItemDetails(items.get(i)));
			}
		}
			
		return null;
	}
	
	/**
	 * Method accepts a item name and updates total Price and monthly payments
	 * for that item in <items>,<prices>,<monthlyPayments> arrayLists
	 * 
	 * @param item name
	 * @param newPrice
	 */
	
	public void updatePrice(String item, double newPrice) {
		//LOAD WHOLE CATALOG HERE FIRST
		
		//TODO
	
	}
	
	/**
	 * Method looks for an item in the catalog and removes
	 * all details for that item including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */
	
	public void deleteItemFromCatalog(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		
		//TODO
	}
	

	/**
	 * Method looks for an item in the catalog by name and return index
	 * 
	 * @param item
	 */
	
	public int findIndexOfItem(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		
		//TODO
		return 0 ; 
	}
	
	/**
	 * Method looks for an item in the catalog by price and return index
	 * 
	 * @param item
	 */
	public int findIndexOfItem(double price) {
		//LOAD WHOLE CATALOG HERE FIRST
		
		//TODO
		return 0 ; 
	}
	
	
	
	
	
		
	
	

}
