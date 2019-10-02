

import acm.program.ConsoleProgram;

public class factorial extends ConsoleProgram {
	
	private static final int MAX_NUM = 5;
	
	public void run() {
		
		for(int i=0; i < MAX_NUM; i++) {
			
			println(i + "! = " + factorial(i));
		}
	}

	private int factorial(int n) {
		// TODO Auto-generated method stub
		int result = 1;
		
		for(int i=1; i<=n; i++) {
			result *= i;
			
		}
		return result;
	}

}
