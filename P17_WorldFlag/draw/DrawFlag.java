package draw;
import java.awt.Color;
import java.util.ArrayList;

import grid.Grid;

public class DrawFlag {
	
	public static void drawFlag(Grid grid, int countryCode) {

		switch(countryCode) {
			case 1:
				france(grid); 
				break;
			case 2:
				argentina(grid); 
				break;
				
			case 3:
				austria(grid); 
				break;
			case 4:
				ukraine(grid); 
				break;
			case 5:
				russia(grid); 
				break;
			case 6:
				mycountry(grid); 
				break;
			default: 
				ErrorFlag(grid); 
				break;
		}
	} 

	public static void ErrorFlag(Grid grid) {
		
		int height = grid.getHt();
		int width = grid.getWd();
		
		for(int col = 0; col < width; col++) {
			grid.setColor(0, col, Color.RED);
		}			
		
		for(int row = 0; row < height; row++) {
			grid.setColor(row, 0, Color.RED);
		}
		
		for(int col = 0; col < width; col++) {
			grid.setColor(height-1, col, Color.RED);
		}			
		
		for(int row = 0; row < height; row++) {
			grid.setColor(row, width-1, Color.RED);
		}
		
		
	}
	
	public static void france(Grid grid) {
		//TO DO
		//Draw France flag
		//Hint: grid.setColor(row, col, Color.RED); will change the color of 
		// one cell at (row,col) to red
		
		//Frace flag is three vertical stripes of blue, white and red
		int height = grid.getHt();
		int width = grid.getWd();
		
		for(int col = 0; col < width/3; col++) {
			for(int row = 0; row < height; row++) {
				grid.setColor(row, col, Color.BLUE);
			}
			
		}			
		

		for(int col =  width/3; col < 2*width/3; col++) {
			for(int row = 0; row < height; row++) {
				grid.setColor(row, col, Color.WHITE);
			}
			
		}
		
		for(int col =  2*width/3; col < width; col++) {
			for(int row = 0; row < height; row++) {
				grid.setColor(row, col, Color.RED);
			}
			
		}
		
		
	}
	
	private static void argentina(Grid grid) {
		//TO DO
		//Draw the flag of Argentina
	}
	
	private static void austria(Grid grid) {
		//TO DO
		//Draw the flag of Austria
	}
	
	private static void ukraine(Grid grid) {
		//TO DO
		//Draw the flag of Ukraine
	}
	private static void russia(Grid grid) {
		//TO DO
		//Draw the flag of Russia
	}
	
	private static void mycountry(Grid grid) {
		//TO DO
		//Draw the flag of your own country
	}
	
	public static void turkey(Grid grid) {
		//TO DO
		//Draw the flag of your own country
//		int height = grid.getHt();
//		int width = grid.getWd();
//		
//		for(int col = 0; col < width; col++) {
//			for(int row = 0; row < height; row++) {
//				grid.setColor(row, col, Color.RED);
//			}
//			
//		}
//		int max= width;
//		int midX = width/2;
//	    int midY = height/2;
//	    int radius[] = {118,40,90,40};
//	    int nPoints = 16;
//	    int[] X = new int[nPoints];
////	    ArrayList<Integer> X= new ArrayList<Integer>();
//	    int[] Y = new int[nPoints];
//
//	    for (double current=0.0; current<nPoints; current++)
//	    {
//	        int i = (int) current;
//	        double x = Math.cos(current*((2*Math.PI)/max))*radius[i % 4];
//	        double y = Math.sin(current*((2*Math.PI)/max))*radius[i % 4];
//
//	        X[i] = (int) x+midX;
//	        Y[i] = (int) y+midY;
//	    }
//
//	
//	    
	    
		
		
		//		// these are the locations of star
//		int[] x = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
//		int[] y = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
//		// but we have to rearrange the star location based on the size of the grid
//		// here is the algorithm : http://www.dreamincode.net/forums/topic/171016-help-to-draw-a-turkish-flag/
//		ArrayList<Integer> starRow= new ArrayList<Integer>();
//		ArrayList<Integer> starCol= new ArrayList<Integer>();
//		for (int i = 0; i < x.length; i++) {
//			starRow.add(x[i]*width/600);
//			
//		}
//		
//		for (int i = 0; i < y.length; i++) {
//			starCol.add(y[i]*height/600);
//			
//		}
//		
////		Place the stars on the flag
//		for(int col = 0; col < width; col++) {
//			for(int row = 0; row < height; row++) {
//				if(starRow.contains(row) && starCol.contains(col))
//				grid.setColor(row, col, Color.WHITE);
//			}
//			
//		}
		
		
	}
	
	
}
