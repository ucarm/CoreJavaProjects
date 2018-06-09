/**
 * In this project, you will write code to process images.
 * Please read the README.pdf for for details.
 */

package imageprocessing;

import java.awt.Color;
import java.util.Arrays;

import edu.princeton.cs.introcs.Picture;

public class Image {
	
	private Picture pic;	//picture object
	private int width;		//width of the image
	private int height;		//heigth of the image
	
	/**
	 * This constructor loads the image and updates width, height member variables
	 * 
	 * @param fileName:  image file name
	 */
	public Image(String fileName){
		pic = new Picture(fileName);
		height = pic.height();
		width = pic.width();
	}
	/**
	 * 
	 * @param obj: input image object
	 * @return true if this image is same as the image in obj 
	 */
	public boolean equals(Image obj){
		return pic.equals(obj.pic);
	}
	
	/**
	 * This task is a warm up to the next one.
	 * Method accepts a 2D String array then 
	 * mirror/reverse values in each inner array
	 * EX:
	 * 	String[][] colors =  {{"blue","red","orange","black"},
			                 {"white","blue","red","black"}};
		mirrorArray(colors) -> [black, orange, red, blue]
							   [black, red, blue, white]
	 * 
	 * 
	 * @param 2D array strArray
	 * @return 2D string array with each inner array values reversed/mirrored
	 *
	 * RUN MAIN METHOD BELOW IN THIS CLASS TO TEST YOUR IMPLEMENTATION
	 *
	 */
	public static void mirrorArray(String[][] strArray) {
		//TODO mirror strArray
		String [][] newStrArray = new String[strArray.length][];
		for(int i =0; i<strArray.length; i++) {
			newStrArray[i]= new String[strArray[i].length];
			for(int j=0; j<strArray[i].length; j++) {
				newStrArray[i][j]= strArray[i][strArray[i].length-1-j];
			}
		}
		
//		System.out.println(Arrays.deepToString(newStrArray));
		for(String[] s: newStrArray) {
			System.out.println(Arrays.toString(s));
		}
//		return newStrArray;
		
		
	}
	
	/**
	 * Implement the mirror method, in which you flip the image, referenced by the Picture 
	 * type variable pic. 
	 *  
	 *  pic variable has image already loaded.
	 *  		-> you can call pic.get(col,row) to get Color object of that pixel/position:
	 *  			Color pixelColor = pic.get(col,row);	
	 *  		-> you can set that color to the new pixel/position :
	 *  			pic.set(newColPosition,newRowPosition,pixelColor);
	 *  height variable has already count of rows in the picture
	 *  width variable has already count of columns in the picture
	 *  
	 *  You need to reverse/mirror colors for each row in the image.
	 *  
	 *  MORE Explanation:
	 *  For example:
	 *  pic.get(x,y) will return the color (Java Color class) of the pixel(x,y). 
	 *  pixel (x, y) is column x and row y, where (0, 0) is upper left
	 *  pic.set(x,y,color) will update the color of the pixel(x,y). 
	 * 
	 *RUN MAIN METHOD BELOW IN THIS CLASS TO TEST YOUR IMPLEMENTATION
	 * 
	 */
	public void mirror(){
		//TODO. PLEASE READ INSTRUCTIONS CAREFULLY
		//PLEASE USE pic, width, height VARIABLES. THEY ARE READY WITH VALUES!
		
	}
	
	public static void main(String[] args){
		String fileName = "images/cybertek.png";
		Image img = new Image(fileName);
		Image img_old = new Image(fileName);
		System.out.println("Width:"+ img.width);
		System.out.println("Height:"+ img.height);
		img_old.pic.show();
		img.mirror();
		img.pic.show();
		
		String[][] arr = {{"blue","red","orange","black"},
			              {"white","blue","red","black"}};
		mirrorArray(arr);
		for (String[] strings : arr) {
			System.out.println(Arrays.toString(strings));
		}
	}
}
