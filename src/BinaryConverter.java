import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	int num;
	JLabel label = new JLabel();
	JTextField textField = new JTextField(10);
	JButton button = new JButton();

	public void createUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridLayout(3, 1));
		button.setText("Convert");

		frame.add(panel);
		frame.setSize(300, 300);
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		button.addActionListener(this);
		// frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (button == buttonClicked) {
			if (num > 15) {
				label.setText("Enter a smaller number");
			}
			if (num < 0) {
				label.setText("Enter a bigger number");
			} else {
				// System.out.println(textField.getText());
				int num = Integer.parseInt(textField.getText());
				System.out.println(num);

				int eightsDigit = num / 8;
				num = num - 8 * eightsDigit;
				int foursDigit = num / 4;
				num = num - 4 * foursDigit;
				int twosDigit = num / 2;
				num = num - 2 * twosDigit;
				int onesDigit = num / 1;
				num = num - 1 * onesDigit;

				String s8Digit = Integer.toString(eightsDigit);
				String s4Digit = Integer.toString(foursDigit);
				String s2Digit = Integer.toString(twosDigit);
				String s1Digit = Integer.toString(onesDigit);

				String addAns = s8Digit + s4Digit + s2Digit + s1Digit;
				// int ans = Integer.parseInt(addAns);

				// System.out.println(addAns);

				label.setText(addAns);
			}
		}
	}

	public static void main(String[] args) {

		BinaryConverter converter = new BinaryConverter();
		converter.createUI();

	}

}
