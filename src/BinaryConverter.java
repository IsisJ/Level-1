import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	
	// add button stuff
	// connect main method code with code down below and make it work!
	
	public void createUI(){
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JTextField textField = new JTextField(10);
		JButton button = new JButton();
		button.setText("Converrt");
		JLabel label = new JLabel();
	
		frame.add(panel);
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		frame.pack();
	
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		BinaryConverter converter = new BinaryConverter();
		converter.createUI();
		
		int num = 8;
		int eightsDigit = num/8;
		num = num-8*eightsDigit;
		int foursDigit = num/4;
		num = num-4*foursDigit;
		int twosDigit = num/2;
		num = num-2*twosDigit;
		int onesDigit = num/1;
		num = num-1*onesDigit;
		
		String s8Digit = Integer.toString(eightsDigit);
		String s4Digit = Integer.toString(foursDigit);
		String s2Digit = Integer.toString(twosDigit);
		String s1Digit = Integer.toString(onesDigit);

		String addAns = s8Digit+s4Digit+s2Digit+s1Digit;
		System.out.println(addAns);
		
		
		
		
		
	}


	

}
