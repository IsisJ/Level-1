import java.awt.Color;
import java.lang.reflect.Method;

public class Peacock {
	private String vibrantColors;
	private int numOfFeathers; 
	private String bodyType;
	
	public Peacock(String vibrantColors){
		this.vibrantColors=vibrantColors;
		System.out.println("I'm a vibrant, bold shade of "+vibrantColors+".");
	}
	public void colorOfPeacock(String color){
		vibrantColors=color;
		System.out.println("My feathers are a majestic  "+color+"!");
	}
	public void peacockBodyType(String bodyType){
		this.bodyType=bodyType;
		System.out.println("I'm "+bodyType+". Hehe");
	}
	public void myFeathers(int numOfFeathers){
		this.numOfFeathers=numOfFeathers;
		System.out.println("I have "+numOfFeathers+" "+vibrantColors+" feathers.");
	}
	public void feathersLeft(){
		numOfFeathers=numOfFeathers-5;
		System.out.println("Ow! You plucked off 5 feathers, now I only have "+numOfFeathers+" left!");
	}
	public int giveFeathers(int num){
		System.out.println("Thank you, you gave me life, you gave me "+num+" feather(s)!");
		return num;
		
	}

	public static void main(String[]args){
		/*Peacock ronnie=new Peacock("blue");
		ronnie.colorOfPeacock("pink");
		ronnie.peacockBodyType("very fat");
		ronnie.myFeathers(100);
		ronnie.feathersLeft();
		ronnie.giveFeathers(3);
		
		
		Peacock linda = new Peacock("orange");
		linda.colorOfPeacock("pink");
		linda.myFeathers(24);
		linda.giveFeathers(8);
		linda.feathersLeft();
		linda.peacockBodyType("square")
		*/
		
		Peacock SirFabulous = new Peacock("boring grey");
		SirFabulous.colorOfPeacock("boringer grey");
		SirFabulous.giveFeathers(6);
		SirFabulous.peacockBodyType("diamond");
	}
}
