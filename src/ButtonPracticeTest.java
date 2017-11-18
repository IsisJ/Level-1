import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPracticeTest implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton redButton = new JButton();
	JButton greenButton = new JButton();
	
	public void createUI(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(greenButton);
		panel.add(redButton);
		redButton.setText("red");
		greenButton.setText("green");
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		frame.pack();
		
	}

	
	public void actionPerformed(ActionEvent e) {
	
		JButton buttonClicked = (JButton)e.getSource();
		if(redButton == buttonClicked){
			panel.setBackground(Color.red);
		}
		if(greenButton == buttonClicked){
			panel.setBackground(Color.GREEN);
		}
		
	}
	public static void main(String[] args) {
		ButtonPracticeTest person = new ButtonPracticeTest();
		person.createUI();
	}

}
