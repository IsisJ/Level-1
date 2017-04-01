import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class cityScape {

	static Robot ronnie = new Robot();

	static void drawBuilding(int height) {
		
		ronnie.setSpeed(10);
		ronnie.setPenColor(Color.BLACK);
		ronnie.penDown();
		ronnie.move(height);
		ronnie.turn(90);
		ronnie.move(100);
		ronnie.turn(90);
		ronnie.move(height);
		ronnie.turn(-90);
		ronnie.setPenColor(Color.green);
		ronnie.move(100);
		ronnie.turn(240);
		

	}

	public static void main(String[] args) {
		ronnie.moveTo(100, 600);
		drawBuilding(300);
		drawBuilding(100);
	}
}
