/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	public void run() {
		/* You fill this in */
		
		displayWelcomeMessage();
		findRange();

	}

	private void findRange() {
		// TODO Auto-generated method stub
		int firstNumber = readInt("? ");
		if(firstNumber == SENTINEL) {
			println("No value is present: ");
		}
		
		int smallestNumber = firstNumber;
		int largestNumber = firstNumber;
		
		while(firstNumber != SENTINEL) {
			int secondNumber = readInt("? ");
			
			if(secondNumber > largestNumber) {
				if(secondNumber != SENTINEL) {
					largestNumber = secondNumber;
				}
			}
			if(secondNumber < smallestNumber) {
				if(secondNumber != SENTINEL) {
					smallestNumber = secondNumber;
				}
			}
			if(secondNumber == SENTINEL) {
				println("smallest: "+ smallestNumber);
				println("largest: "+ largestNumber);
				break;
			}
		}
		
	}

	private void displayWelcomeMessage() {
		// TODO Auto-generated method stub
		println("This Program finds smallest and largest Number");
	}
}

