import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseListenerTest implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moused clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moused pressed");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moused released");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moused entered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moused exited");

	}

	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.add(panel);
		frame.addMouseListener(this);
		
	}
	
	
	public static void main(String[] args) {
		
		MouseListenerTest person = new MouseListenerTest();
		
		person.createUI();
		
		
		
	}
	
	
}
