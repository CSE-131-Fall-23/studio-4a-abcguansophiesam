package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(300,200);
		StdDraw.setXscale(0, 3); // Set the x-axis scale (0 to 3)
        StdDraw.setYscale(0, 2);
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(2.5,1,0.5,1);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(1.5,1,0.5,1);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0.5,1,0.5,1);
		
		/*StdDraw.setCanvasSize(800,600);
		 StdDraw.setXscale(0, 1); // Set the x-axis scale (0 to 1)
	        StdDraw.setYscale(0, 1); // Set the y-axis scale (0 to 1)

	        // Define the vertices of the star
	        double[] x = {0.5, 0.6, 0.65, 0.7, 0.8};
	        double[] y = {0.7, 0.85, 0.65, 0.85, 0.7};

	        // Draw the star
	        StdDraw.polygon(x, y);*/
	}
}