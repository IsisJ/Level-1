
public class Shoop {
	private int tailLength;
	private String shape;
	private String clothes;
	private String color;
	private String colorWool;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
	}

	public void dressMe(String clothes, String color) {
		this.clothes = clothes;
		this.color = color;
		System.out.println("I now have a " + color + " " + clothes + ".");
	}

	public void dyeWool(String colorWool) {
		this.colorWool=colorWool;
		System.out.println("Yay! I have "+colorWool+" wool!!");
	}

	public void lengthenTail() {
		tailLength = tailLength + 2;
		System.out.println("My tail is now "+tailLength+" feet long.");
	}

	public void describeYourSelf() {
		System.out.println("I have the tail length of " + tailLength + " and a shape of a " + shape + ". I'm wearing a "+color+" colored "+clothes+" and I have "+colorWool+" wool.");
	}

	public static void main(String[] args) {
		Shoop isis= new Shoop(3,"Isis");
		
		isis.dressMe("shirt", "red");
		isis.dyeWool("rose pink");
		isis.describeYourSelf();
		isis.dressMe("ripped jacket with ripped jeans", "black");
		isis.describeYourSelf();
		isis.dressMe("bomber jacket", "navy blue");
		isis.lengthenTail();
		isis.describeYourSelf();
		
	}
}
