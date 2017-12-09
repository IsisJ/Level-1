import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyKnowledge implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public void ctreateUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(label);
		label.setText("No key typed");
		frame.setTitle("Key Knowledge");
		frame.addKeyListener(this);
		
	}

	public void keyTyped(KeyEvent e) {
		//System.out.println(keyDescription(e));
		label.setText(keyDescription(e));
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	private String keyDescription(KeyEvent event) {
		return "key: " + event.getKeyChar();
	}

	public static void main(String[] args) {
		KeyKnowledge keyPerson = new KeyKnowledge();
		keyPerson.ctreateUI();
	}
}
