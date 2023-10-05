package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//background
		StdDraw.setPenColor(255, 179, 25);
		StdDraw.filledRectangle(.5, .5, .4, .3);
		//stem
		StdDraw.setPenColor(77,25,0);
		StdDraw.filledRectangle(.65, .45, .02, .03);
		//pumpkin
		StdDraw.setPenColor(230,115,0);
		StdDraw.filledCircle(.7, .35, .1);
		// left eye
		StdDraw.setPenColor(255, 179, 102);
		double[] x = {.65, .62, .68 };
		double[] y = { .4, .36, .36};
		StdDraw.filledPolygon(x, y);
		// right eye
		StdDraw.setPenColor(255, 179, 102);
		double[] X = {.75, .72, .78 };
		double[] Y = { .4, .36, .36};
		StdDraw.filledPolygon(X, Y);
		// mouth
		StdDraw.setPenColor(255, 179, 102);
		StdDraw.filledCircle( .7, .3, .03);
		StdDraw.setPenColor(230,115,0);
		StdDraw.filledRectangle( .7, .28, .03, .02);
		
		//Bat
		StdDraw.setPenColor(77,0,51);
		StdDraw.filledCircle( 0.4, 0.6, .1);
		//right wing
		StdDraw.setPenColor(77,0,51);
		double[] rx = {.52, .56, .64, .64, .62, .62, .6, .35};
		double [] ry = {.7, .73, .75, .73, .73, .7, .65, .52};
		StdDraw.filledPolygon(rx, ry);
		
		// left wing 
		StdDraw.setPenColor(77,0,51);
		double[] lx = {.2, .24, .32, .32, .30, .30, .28, .16};
		double [] ly = {.52, .49, .46, .43, .43, .4, .45, .52};
		StdDraw.filledPolygon(lx, ly);
		}
		
		}
	
