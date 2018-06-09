package draw;

import java.awt.Color;

import grid.Grid;

public class PracticeDraw {

	public static void main(String[] args) {
		
		
		Grid grid = new Grid(15);
		System.out.println("Grid Height is : " + grid.getHt());
		System.out.println("Grid Width is : " + grid.getWd());

//		grid.setColor(1, 2, Color.RED);
//		grid.setColor(2, 3, Color.BLUE);
//		DrawFlag.france(grid);

		DrawFlag.france(grid);
		
		

	}

}
