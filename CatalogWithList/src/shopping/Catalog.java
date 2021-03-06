package shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Catalog {

	public ArrayList<String> items;
	public ArrayList<Double> prices;
	public ArrayList<Double> monthlyPayments;

	public Catalog() {
		this.items = new ArrayList<>();
		this.prices = new ArrayList<>();
		// this.prices = new ArrayList<>();
		this.monthlyPayments = new ArrayList<>();
		
	}

	/**
	 * This method adds all listed items to <items> arraylist that is already
	 * declared above
	 */
	public void loadItems() {
		// TODO

		String[] stuff = { "iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacbookPro", "ThumbDrive", "Beats HeadPhones",
				"Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch" };

		items = new ArrayList<>(Arrays.asList(stuff));

	}

	/**
	 * This method adds all listed prices to <prices> arraylist that is already
	 * declared above
	 */
	public void loadPrices() {
		// TODO

		double[] pr = { 449.0, 549.0, 1149.0, 1499.99, 39.99, 349.99, 79.99, 39.99, 429.0, 399.0, 2199.0, 559.0 };
		for (double d : pr) {
			prices.add(d);
		}
	}

	/**
	 * This method adds all listed monthly payments to <monthlyPayments> arraylist
	 * that is already declared above
	 */

	public void loadMonthlyPayments() {
		double[] pymnts = { 18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18 };
		for (double e : pymnts) {
			monthlyPayments.add(e);
		}
	}

	/**
	 * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
	 * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
	 */
	public void loadWholeCatalog() {
		loadItems();
		loadPrices();
		loadMonthlyPayments();
	}

	/**
	 * Write a method that reads values from above ArrayLists and returns a
	 * stringbuilder with all item details: return format: iPhone 6s-449.0-18.71
	 * iPhone 6s Plus-549.0-22.88 ..
	 * 
	 */

	public StringBuilder getWholeCatalog() {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < items.size(); i++) {
			sb.append(items.get(i)).append("-");
			sb.append(prices.get(i)).append("-");
			sb.append(monthlyPayments.get(i)).append("\n");

		}

		return sb;
	}
	// TODO
	// StringBuilder sb = new StringBuilder();
	// for (String a : items) {
	// for (double b : prices) {
	// for (double c : monthlyPayments) {
	// sb.append(a+"-"+b+"-"+c);
	// }
	// }
	// }
	//
	// return sb;

	/**
	 * write a method that an item name and returns all details for it. If item is
	 * not in the list then returns null ex: getItemDetails("ThumbDrive")
	 * -->ThumbDrive-39.99-2.68 getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();

		// TODO
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).toString().equals(item)) {
				return item + "-" + prices.get(i) + "-" + monthlyPayments.get(i);
			}
		}

		return null;

		// return null;

	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * Charger-39.99-4.56 getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double
	 *            price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		// TODO
		ArrayList<String> answer = new ArrayList<>();

		for (int i = 0; i < monthlyPayments.size(); i++) {
			if (monthlyPayments.get(i) <= price) {
				answer.add(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i));
			}
		}
		if (answer.isEmpty())
			answer.add("");

		return answer;
	}

	/**
	 * Method accepts a item name and updates total Price and monthly payments for
	 * that item in <items>,<prices>,<monthlyPayments> arrayLists
	 * 
	 * @param item
	 *            name
	 * @param newPrice
	 */

	public void updatePrice(String item, double newPrice) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		// TODO
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equalsIgnoreCase(item)) {
				prices.set(i, newPrice);
				monthlyPayments.set(i, newPrice / 12);
			}
		}
	}

	/**
	 * Method looks for an item in the catalog and removes all details for that item
	 * including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */

	public void deleteItemFromCatalog(String item) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		// TODO
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equalsIgnoreCase(item)) {
				items.remove(i);
				prices.remove(i);
				monthlyPayments.remove(i);
			}
		}
	}

	/**
	 * Method looks for an item in the catalog by name and return index
	 * 
	 * @param item
	 */

	public int findIndexOfItem(String item) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		int answer = -1;
		// TODO
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equalsIgnoreCase(item)) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	/**
	 * Method looks for an item in the catalog by price and return index
	 * 
	 * @param item
	 */
	public int findIndexOfItem(double monthlyPayment) {
		// LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		int answer = -1;
		// TODO
		for (int i = 0; i < monthlyPayments.size(); i++) {
			if (monthlyPayments.get(i) == monthlyPayment) {
				answer = i;
				break;
			}
		}
		return answer;
	}

}