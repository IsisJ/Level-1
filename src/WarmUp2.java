import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class WarmUp2 {

public void createUI() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		JButton button = new JButton();
		JSlider slider = new JSlider();
		JTextField textField = new JTextField(20);
		JLabel testPic = new JLabel("Button");
		frame.add(panel);
		panel.add(button);
		panel.add(slider);
		panel.add(textField);
		panel.add(testPic);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.pack();
		
		
	}
public static void main(String[] args) {
	
	 WarmUp2 warmUp = new WarmUp2();
	 
	 warmUp.createUI();
	 
	
	 
	
	
}








}
