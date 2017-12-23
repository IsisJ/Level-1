import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddles implements ActionListener {

	JButton hintButton = new JButton();
	JTextField answerTextField = new JTextField(10);
	JButton submitButton = new JButton();

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel answerLabel = new JLabel();
		JLabel riddleLabel = new JLabel();

		frame.setVisible(true);
		frame.setTitle("Riddle");
		frame.add(panel);
		panel.add(riddleLabel);
		panel.add(hintButton);
		panel.add(submitButton);
		panel.add(answerLabel);
		panel.add(answerTextField);
		riddleLabel.setText("What has a head, a tail, is brown, and has no legs?");
		answerLabel.setText("Answer:");
		hintButton.setText("Help, I need a hint");
		submitButton.setText("Submit");
		submitButton.addActionListener(this);
		hintButton.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(hintButton == buttonPressed) {
			
			JOptionPane.showMessageDialog(null, "I am carried around in a pocket");			
		}
		else {
			String answer = answerTextField.getText();
			if(answer.equals("a penny") ) {
				
				JOptionPane.showMessageDialog(null, "Correct!");			
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Wrong!");			
				
			}
		}
		
	}

	public static void main(String[] args) {
		Riddles riddleMan = new Riddles();
		riddleMan.createUI();
	}

}
