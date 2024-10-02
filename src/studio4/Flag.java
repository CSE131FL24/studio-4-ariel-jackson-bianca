package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	//rectangle!	
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.3);
		//Shadow
		StdDraw.setPenColor(250,192,2);
		StdDraw.filledCircle(0.55,0.46,0.2);
		//FACE
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		//Eyes
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.4, 0.55, 0.03);
		StdDraw.filledCircle(0.6, 0.55, 0.03);
		//Half Circle
		StdDraw.setPenColor(0,0,0);
		
		StdDraw.arc(0.5, 0.5, 0.01, 200, 340);
		
}}