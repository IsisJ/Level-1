import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonClicker implements ActionListener {

	JButton redButton = new JButton();
	JButton blueButton = new JButton();

	public void createUI(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		redButton.setText("red button");
		blueButton.setText("blue button");
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(panel);
		panel.add(blueButton);
		panel.add(redButton);
		frame.pack();
		redButton.addActionListener(this);
		blueButton.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == redButton){
			
			System.out.println("I am a red button :)");
			
		}else{
			
			System.out.println("I am a blue button ;)");
		}
		
		
	}

	public static void main(String[] args) {
		ButtonClicker isis = new ButtonClicker();
		isis.createUI();
	}
	

}
