import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {

	Date gameStart = new Date();
	Random random = new Random();
	JFrame frame = new JFrame();
	int moleTracker;

	public void createUI() {
		frame = new JFrame();

		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(400, 250);
		frame.add(panel);
		int randomNum = random.nextInt(20) + 1;
		System.out.println("creating new random number " + randomNum + ".");
		for (int i = 1; i <= 25; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == randomNum) {
				button.setText("Mole");
			}
		}

	}

	public void gameTime() {

		Date gameEnd = new Date();

		long start = gameStart.getTime();
		System.out.println("game start: " + gameStart);
		long end = gameEnd.getTime();
		System.out.println("game end: " + gameEnd);
		long gameTime = end - start;
		//long gameTimeInSec = gameTime/1000.0;
		JOptionPane.showMessageDialog(null, "You wacked 10 moles in " + gameTime/1000.0 + ".");

	}

	public void actionPerformed(ActionEvent e) {

		JButton buttonClicked = (JButton) (e.getSource());
		String isMole = buttonClicked.getText();
		System.out.println(" text is " + isMole + " .");
		if (isMole.equals("Mole")) {
			moleTracker = moleTracker + 1;
			System.out.println(moleTracker + " mole(s)");
			System.out.println("click");
			if (moleTracker < 10) {
				frame.dispose();
				this.createUI();
			} else {
				this.gameTime();
			}
		}

	}

	public static void main(String[] args) {

		WackAMole mole = new WackAMole();
		mole.createUI();


	}

}
