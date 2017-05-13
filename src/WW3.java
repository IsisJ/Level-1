import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WW3 implements ActionListener {
	static JFrame france = new JFrame();
	static JPanel japan = new JPanel();
	static JButton britain = new JButton();

	public static void main(String[] args) {

		france.setVisible(true);
		france.add(japan);
		japan.add(britain);
		france.setTitle("WWIII");
		britain.setText("Start WWIII");
		france.pack();
		japan.setBackground(Color.RED);
	}

	// public void actionPreformed(ActionEvent arg0) {
	// JButton buttonPressed = (JButton) arg0.getSource();

	// }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		

	}

}
