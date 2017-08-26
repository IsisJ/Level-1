import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	public JButton leftButton = new JButton();
	public JButton rightButton = new JButton();
	public JButton middleButton = new JButton();

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.add(rightButton);
		panel.add(middleButton);
		panel.add(leftButton);
		
		leftButton.setText("Ducks");
		rightButton.setText("Frogs");
		middleButton.setText("Fluffy Unicorns");

		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		middleButton.addActionListener(this);
		
		frame.pack();
	}

	public static void main(String[] args) {
		CutenessTv tv = new CutenessTv();
		tv.createUI();
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (leftButton == buttonPressed) {
			showDucks();
		}
		if (rightButton == buttonPressed) {
			showFrog();
		}
		if(middleButton==buttonPressed){
			showFluffyUnicorns();
		}
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
