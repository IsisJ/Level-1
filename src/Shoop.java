
public class Shoop {
	private int tailLength;
	private String shape;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
	}

	public void lengthenTail() {
		tailLength = tailLength + 2;
		System.out.println(tailLength);
	}

	public void discribeYourSelf() {
		System.out.println("I have the tail length of "+tailLength+" and a shape of a "+shape+".");
	}

	public static void main(String[] args) {
		Shoop petCarl = new Shoop(3, "triangle");
		petCarl.lengthenTail();
		petCarl.discribeYourSelf();
	}
}
