package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		in.hasNext();
			String shape = in.next();
				
		in.hasNextInt();
		int int1= in.nextInt();
		int int2= in.nextInt();	
		int int3= in.nextInt();
		
		in.hasNextBoolean();
			boolean a = in.nextBoolean();
		
		in.hasNextDouble();
			double value1 = in.nextDouble();
			double value2 = in.nextDouble();
			double value3 = in.nextDouble();
			double value4 = in.nextDouble();
			double value5 = in.nextDouble();
			double value6 = in.nextDouble();
			
		Color purply = new Color(int1, int2, int3);
		StdDraw.setPenColor(purply);
		
		if (shape.equals("rectangle")) {
			if (a==true)
			StdDraw.filledRectangle(value1, value2, value3, value4);
			if (a!=true)
			StdDraw.rectangle(value1, value2, value3, value4);
		}
		if (shape.equals("ellipse")) {
			if (a==true)
			StdDraw.filledEllipse(value1, value2, value3, value4);
			if (a!=true)
			StdDraw.ellipse(value1, value2, value3, value4);
		}
		/*if (shape.equals("triangle")) {
			if (a==true)
			StdDraw.filledPolygon(value1, value2, value3, value4,value5,value6);
			if (a!=true)
			StdDraw.polygon(value1, value2, value3, value4,value5,value6);
		}*/
}
}