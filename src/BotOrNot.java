import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.setup.MacThumbDriveInstaller;

public class BotOrNot implements ActionListener{

	public BotOrNot(){
		
	}
	
	public void createUI() throws MalformedURLException{
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		String botTestPicture = "BotOrNotTest.jpg";
		JLabel testPic = createLabelImage(botTestPicture);
		JButton button = new JButton();
		button.setText("OK");
		JTextField textField = new JTextField(20);
		frame.add(panel);
		panel.add(button);
		panel.add(textField);
		panel.add(testPic);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.pack();
		button.addActionListener(this);
		
	}
	
	
	
	public void actionPerformed(ActionEvent event) {
		
		JButton buttonPressed = (JButton)event.getSource();
	
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


}
// create an if statement for the possible correct answers on chosen picture
// if wrong tell user they're a robot
// if right tell user they're human
// after that have the program close its self

