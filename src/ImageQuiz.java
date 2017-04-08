import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageQuiz {
	private static Component createImage( String urlString) throws MalformedURLException{
		URL link= new URL(urlString);
		ImageIcon picture= new ImageIcon(link);
		JLabel lab= new JLabel(picture);
		return lab;
	}
	public static void main(String[] args) throws Exception {
		Frame quizWindow=new Frame();
		quizWindow.setVisible(true);
		Component pic= createImage("https://s-media-cache-ak0.pinimg.com/originals/a8/93/f4/a893f4ef6c8fe4a54acde25fcce521b4.jpg");
		quizWindow.add(pic);
		quizWindow.pack();
	}

}
