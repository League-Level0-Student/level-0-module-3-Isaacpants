import org.jointheleague.graphical.robot.Robot;

public class ObediantFobot {
	// Obedient Robot

	// Copyright (c) The League of Amazing Programmers 2013-2017
	// Level 0

	// We are going to make an obedient robot that will obey our commands to draw
	// shapes.
	static Robot r2d2 = new Robot();

	// 1. Make a new class, create a main method, and show the robot.
	public static void main(String[] args) {

		// 2. Have the robot draw a square.
		r2d2.penDown();
		r2d2.setSpeed(500);
		r2d2.hide();
		r2d2.setPenWidth(5);

		drawSquare();
		r2d2.penUp();
		r2d2.move(100);
		r2d2.penDown();
		drawTriangle();
		r2d2.penUp();
		r2d2.move(100);
		r2d2.penDown();
		drawCircle();
		// 3. Extract this code into a drawSquare() method.

		// 4. Have the robot draw a triangle.

		// 5. Extract this code into a drawTriangle() method.

		// 6. Have the robot draw a circle.

		// 7. Extract this code into a drawCircle() method.

	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {

			r2d2.move(50);
			r2d2.turn(90);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			r2d2.turn(120);
			r2d2.move(50);

		}
	}

	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			r2d2.turn(1);
			r2d2.move(1);

		}
	}
}