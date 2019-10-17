

import stanford.karel.*;

public class SteepleChase extends SuperKarel{
	
	public void run() {
		
		for(int i=0; i < 8; i++) {
			
			if(frontIsClear()) {
				move();
				}
			
			else {
					jumpHurdle();
				}
			
		}
		
		
	}
	
	
	
	private void jumpHurdle() {
		// TODO Auto-generated method stub
		ascendHurdle();
		move();
		descendHurdle();
		
	}
	/*
	 * Code to move down the hurdle 
	 */

	private void descendHurdle() {
		// TODO Auto-generated method stub
		turnRight();
		moveToWall();
		turnLeft();
	}
	
	/*
	 * Move down until karel hits the wall!
	 */
	private void moveToWall() {
		// TODO Auto-generated method stub
		while(frontIsClear()) {
			move();
		}
		
	}



	/*
	 * 	Code to move up the hurdle
	 */
	private void ascendHurdle() {
		// TODO Auto-generated method stub
		turnLeft();
		while(rightIsBlocked()) {
			move();
		}
		turnRight();
		
	}
	
}
