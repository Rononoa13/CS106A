
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class FeltBoard extends GraphicsProgram{

	// Constant representing the golden ratio:
	private static final double PHI = 1.618;

	public void run() {
		
		//Rectangle object
		GRect rect = new GRect(100, 50, 100, 100/PHI);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
	// Oval Object
		GOval oval = new GOval(150, 50 + 50 / PHI, 100, 100/PHI);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		
		
		add(oval);
		oval.sendBackward();
		//oval.sendToBack();
		
		
	}
}
