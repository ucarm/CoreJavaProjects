//WARM UP 
//
//
//
//Create a class called MyStringToolBox
//
//Create a instance field called targetString
//
//Create a constructor with no argument
//
//Create a constructor 1 argument to set the value 
//
//Create a method called calculateSum() 
//
//take no parameter and it will get the sum of all the number found in String
//
//if there is no number found in the String it will return 0 
//
//
//
//Create a method called getList() 
//
//take no parameter and return an ArrayList of Character
//
//it will loop through each character in targetString field 
//add each character to a Arraylist object created inside this method 
//if it's not a number 
//Create a class called StringRunner with main method 
//
//create 1 instance of MyStringToolBox Class 
//
//and set the targetString value to mix of number and character 
//

package MyStringToolBox;

import java.util.ArrayList;

public class MyStringToolBox {
	
	String targetString;
	
	public MyStringToolBox() {
		
	}
	
	public MyStringToolBox(String targetString) {
		this.targetString= targetString;
	}
	
	public int calculateSum() {

		int sum =0;
		for (int i = 0; i < targetString.length(); i++) {
			if(Character.isDigit(targetString.charAt(i))) {
				String temp= ""+targetString.charAt(i);
				sum+= Integer.parseInt(temp);
			}
			
		}
		
		return sum;	
	} 
	
	public ArrayList<Character> getList(){
		ArrayList<Character> lst= new ArrayList<>();
		for (int i = 0; i < targetString.length(); i++) {
			if(Character.isAlphabetic(targetString.charAt(i))) {
				lst.add(targetString.charAt(i));
			}
			
		}
		return lst;
	}
	
}
