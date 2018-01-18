
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		r2d2.setX(100);
		// 2. Make the robot draw a star shape. Hint: 144.
		r2d2.hide();
		r2d2.setSpeed(500);
		r2d2.penDown();
		for (int l = 0; l < 15; l++) {

			for (int i = 0; i < 5; i++) {

				r2d2.move(30);
				r2d2.turn(144);
			}
			r2d2.turn(110);
			r2d2.move(50);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
