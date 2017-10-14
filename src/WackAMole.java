import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {
	/**
	 * create UI 
	 * 	frame panel 
	 * 	generate a random number from 1-20 
	 * 	for i= 1....20 makeButton() 
	 * 		if(i==randomnumber) make
	 * 			text says "mole"
	 *
	 */
	

	JFrame frame = new JFrame();
	
	public void createUI() {
		
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.setSize(400, 250);
		frame.add(panel);
		Random random = new Random();
		int randomNum = random.nextInt(20);
		System.out.println("creating new random number "+ randomNum+ ".");
		for (int i = 1; i <= 25; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if (i == randomNum) {
				button.setText("Mole");
			}
		}
	}

	/*
	 * action perform 
	 * 	check pressed button 
	 * 	if mole button pressed 
	 * 		disposed frame : frame.dispose(); 
	 * 		createUI() 
	 * 	else play
	 * 		loser sound effect
	 * 
	 */

	public void actionPerformed(ActionEvent e){
		
		JButton buttonClicked = (JButton)(e.getSource());
		String isMole = buttonClicked.getText();
		System.out.println(" text is "+ isMole+" .");
		if(isMole.equals("Mole")){
			System.out.println("click");
			frame.dispose();
			this.createUI();
		}
		
		
	}
	
	
	/**
	 * makeButton()
	 *  instantiate button 
	 *  add listener
	 *   add to panel
	 * 
	 * 
	 */

	public static void main(String[] args) {

		WackAMole mole = new WackAMole();
		mole.createUI();

	}

	

}
