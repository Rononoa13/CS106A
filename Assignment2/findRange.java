

import acm.program.ConsoleProgram;

public class findRange extends ConsoleProgram{
	
	private static final int SENTINEL = 0;

	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		int firstNumber = readInt("? ");
		
		/*	Program to display message
		 *  if user enter the sentinel on the very first input
		 *  */
		if(firstNumber == SENTINEL) {
			println("No values has been entered:");
			//break;
			}
		
		/* If user only enters one value before SENTINEL */
		int smallestNumber = firstNumber;
		int largestNumber = firstNumber;
		
		/*
		 * First number is not equal to SENTINEL.
		 * compares each number after first number and
		 * stores them in largestNumber or smallestNumber accordingly
		 * */
			
		while(firstNumber != SENTINEL) {
			int secondNumber = readInt("? ");
			
			/*compares second number to first number*/
			if(secondNumber > largestNumber) {
				if(secondNumber != SENTINEL) {
					largestNumber = secondNumber; //stores largest number in largestNumber
				}
			}
			else if(secondNumber < smallestNumber) {
				if(secondNumber != SENTINEL) {
					smallestNumber = secondNumber;//stores smallest number in smallestNumber
				}
			}
			
			if(secondNumber == SENTINEL) {
				println("largest: " + largestNumber);
				println("smallest: " + smallestNumber);
				break;
			}
			
		}
		
		}
	}

