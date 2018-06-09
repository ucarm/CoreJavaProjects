package tracker;

import audio.Song;
import shapes.Rectangle;
import videos.Movie;


public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect= new Rectangle(10.0,10.0);
		Song song= new Song("Hello", "Adele");
		Movie movie= new Movie("MyMovie", 10.1);
		
		printShapes(rect);
	}
	public static void printShapes(Rectangle shape) {
		System.out.println("You have a Rectangle\nHeight: "+shape.getHeight()+" Width: "+shape.getWidth());
	}
}
