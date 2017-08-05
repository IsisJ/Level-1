
public class Fractions {

	public int numerator;
	public int denominator;

	public Fractions(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public float getValue() {
		// float floatNumerator= numerator;
		// float floatDenominator= denominator;
		// return floatNumerator/floatDenominator;
		return (float) numerator / denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator= denominator;
		if( denominator==0){
			System.out.println("Invalid Denominator");
		}
	}

}
