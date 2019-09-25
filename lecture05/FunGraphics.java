/*
 * File: Fun Graphics.java
 * -----------------------------------------
 * */

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class FunGraphics extends GraphicsProgram{
	
	public void run() {
		
		GLabel label = new GLabel("Hello, World", 100,75);
		label.setColor(Color.RED);
		add(label);
		
		GRect rectangle = new GRect(10,10,50, 50);
		add(rectangle);
		
		GRect rectangle1 = new GRect(300,75,200,100);
		rectangle1.setFilled(true);
		rectangle1.setFillColor(Color.RED);
		add(rectangle1);
		
		GOval oval = new GOval(300,75,200,100);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
		
		GLine myFunkyLine = new GLine(100,150,200,175);
		add(myFunkyLine);
		
		GOval oval1 = new GOval(getWidth(), getWidth());
		oval1.setColor(Color.GREEN);
		add(oval1);
	}

}
