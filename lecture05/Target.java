/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */

		outerCircle();
		midCircle();
		innerCircle();
	}

	private void innerCircle() {
		// TODO Auto-generated method stub
		double radius = 72 * 3/10;
		
		//Positioning in center
		double x = getWidth()/2 - radius;
		
		double y = getHeight()/2 - radius;
	
		GOval inCircle = new GOval(x, y, radius*2, radius*2);
		inCircle.setFilled(true);
		inCircle.setFillColor(Color.RED);
		add(inCircle);
		
	}

	private void midCircle() {
		// TODO Auto-generated method stub
		double radius = 72 * 65/100;
		
		//Positioning in center
		double x = getWidth()/2 - radius;
		
		double y = getHeight()/2 - radius;
	
		GOval midCircle = new GOval(x, y, radius*2, radius*2);
		midCircle.setFilled(true);
		midCircle.setFillColor(Color.WHITE);
		add(midCircle);
			
	}

	private void outerCircle() {
		// TODO Auto-generated method stub
		
		int radius = 72;
		
		// Positioning in Center
		 double x = getWidth() / 2 - radius;
		
		 double y = getHeight()/2 - radius ;
		 
		GOval outCircle = new GOval(x, y, radius*2, radius*2);
		outCircle.setFilled(true);
		outCircle.setFillColor(Color.RED);
		add(outCircle);
		
		
	}

	
}
