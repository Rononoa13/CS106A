

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class drawCheckerBoard extends GraphicsProgram {
	
	/*	Private Constants	*/
	
	/*	Number of Rows	*/
	private static final int NROWS = 8;
	/*	Number of Columns	*/
	private static final int NCOLUMNS = 8;
	
	public void run() {
		
		int squareSize = getHeight() / NROWS;
		
		for(int i=0; i < NROWS; i++) {
			
			int y = i * squareSize;
			
			for(int j=0; j < NCOLUMNS; j++) {
				
				int x = j * squareSize;
				
				GRect square = new GRect(x, y, squareSize, squareSize);
				/* != Always gives a boolean value*/
				square.setFilled((i + j)%2 != 0);
				add(square);
				
			}
		}
	}

}
