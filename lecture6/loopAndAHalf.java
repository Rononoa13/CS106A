

import acm.program.*;

public class loopAndAHalf extends ConsoleProgram{
	
	private static final int SENTINEL = 0;
	
	public void run() {
		
		int total = 0;
		/*
		 * This program adds integers until
		 * user given input equals 0
		 * 
		 * */
		while(true) {
			
			int value = readInt("Enter Value: ");
			if(value == SENTINEL) {break;}
			total = total + value;
		}
		println("Total = " + total);
		/*
		 * We see here repetition of code, so
		 * ... 
		int value = readInt("Enter a value:\n" );
		
		
		while(value != SENTINEL) {
			
			total = total + value;
			value = readInt("Enter a value:\n");
			
		}
		println("Total = "+ total);
		*/
	}

}
