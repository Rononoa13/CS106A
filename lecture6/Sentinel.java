

import acm.program.ConsoleProgram;

public class Sentinel extends ConsoleProgram {
	
	private static final int SENTINEL = 0;

	public void run() {
		
		int num = readInt("Enter Value: ");
		int sum = 0;
		
		while(num != SENTINEL) {
			
			sum += num;
			num = readInt("Enter Value: ");
			
		}
		println("Total Sum: " + sum);
		
	}
}
