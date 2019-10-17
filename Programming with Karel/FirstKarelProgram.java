import stanford.karel.*;

public class FirstKarelProgram extends Karel{
	
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		move();
		putBeeper();
		move();
	
	}

	private void turnRight() {
		// TODO Auto-generated method stub
		for(int i=0;  i<3; i++) {
			turnLeft();
		}
	}
}
