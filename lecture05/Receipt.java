
import acm.program.*;

public class Receipt extends ConsoleProgram{
	
	public void run() {
		int subtotal = 38 + 40 + 30;
		double tax = subtotal  * 0.8;
		double tip = subtotal * .15;
		
		println("Subtotal: "+ subtotal);
	}

}
