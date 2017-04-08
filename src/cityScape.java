import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class cityScape {

	static Robot ronnie = new Robot();

	static void drawBuilding(int height, Color color) {
		ronnie.setPenWidth(5);
		ronnie.setSpeed(10);
		ronnie.setPenColor(color);
		ronnie.penDown();
		ronnie.move(height);
		ronnie.turn(90);
		ronnie.move(100);
		ronnie.turn(90);
		ronnie.move(height);
		ronnie.turn(-90);
		ronnie.setPenColor(Color.green);
		ronnie.move(100);
		ronnie.turn(-90);
		
	}

	static void drawPointyBuilding(int height,Color color){
		
		//set pen width wider
		ronnie.setPenWidth(1);
		ronnie.setSpeed(10);
		ronnie.setPenColor(color);
		ronnie.penDown();
		ronnie.move(height);
		ronnie.turn(60);
		ronnie.move(40);
		ronnie.turn(60);
		ronnie.move(40);
		ronnie.turn(60);
		ronnie.move(height);
		ronnie.turn(-90);
		ronnie.setPenColor(Color.green);
		ronnie.move(100);
		ronnie.turn(-90);
		
		
		
	}
	public static void main(String[] args) {
		ronnie.moveTo(100, 600);
		drawBuilding(300,Color.MAGENTA);
		drawBuilding(100,Color.orange);
		drawPointyBuilding(400,Color.BLUE);
	}
}
