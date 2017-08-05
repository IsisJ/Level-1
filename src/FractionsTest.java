
public class FractionsTest {
	public static void main(String[] args) {
		Fractions f1 = new Fractions(2,3);
		System.out.println(f1.getValue() + "");// answer should be .6666667
		f1.denominator=5;
		System.out.println(f1.getValue());//0.4
		f1.setDenominator(0);
		System.out.println(f1.getValue());
	}
}
