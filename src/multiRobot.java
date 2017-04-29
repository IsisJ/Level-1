import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class multiRobot {
public static void main(String[] args) {
Robot ronald = new Robot();
ronald.penDown();
ronald.setSpeed(10);
for(int i=0; i<4;i++){
	ronald.move(300);
	ronald.turn(90);
}
Robot ronnie=new Robot();
ronnie.penUp();
ronnie.moveTo(500,500);
ronnie.penDown();
ronnie.setPenColor(Color.MAGENTA);
for(int i=0; i<4;i++){
	ronnie.move(300);
	ronnie.turn(90);
}
	Robot me= new Robot();
	me.setPenColor(Color.PINK);
	me.penUp();
	me.moveTo(650, 650);
	me.penDown();
	me.setSpeed(10);
	me.penDown();
	me.setPenWidth(10);
	
	for(int i=0; i<4;i++){
		me.move(300);
		me.turn(90);
	}
}
}
