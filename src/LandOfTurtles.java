
import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {

	public static void main(String[] args) {
		Random random = new Random();
		Random randoms= new Random();
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		frame.pack();
		// 4. Instantiate a Turtle
		Turtle turtle = new Turtle();
		// 5. Add the turtle to the panel
		int panelWidth = panel.getWidth();
		int panelHeight = panel.getHeight();
		System.out.println(panelHeight);
		System.out.println(panelWidth);
		for (int i = 0; i < 50; i++) {
			int randomNum=random.nextInt(301);
			int randomNums=randoms.nextInt(443);
			Turtle newTurtle= new Turtle();
			panel.addTurtle(newTurtle);
			newTurtle.setX(randomNum);
			newTurtle.setY(randomNums);
			//System.out.println(randomNum);
			//System.out.println(randomNums);
		}
		// 6. Put 50 Turtles on the beach

	}
}
