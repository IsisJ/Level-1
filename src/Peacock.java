import java.awt.Color;
import java.lang.reflect.Method;

public class Peacock {
	private String vibrantColors;
	public Peacock(String vibrantColors){
		this.vibrantColors=vibrantColors;
		System.out.println("I'm a vibrant, bold shade of "+vibrantColors+".");
	}
	public void colorOfPeacock(String color){
		vibrantColors=color;
		System.out.println("My feathers are a majestic  "+color+"!");
	}
	public static void main(String[]args){
		Peacock ronnie=new Peacock("blue");
		ronnie.colorOfPeacock("pink");
		
	}
}
