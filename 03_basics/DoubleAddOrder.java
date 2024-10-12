// Taken from https://www.baeldung.com/java-floating-point-sum-order
public class DoubleAddOrder {
	public static void main(String args[]) {
		double a = 13.22;
		double b = 4.88;
		double c = 21.45;

		double abc = a + b + c;
		System.out.println("a + b + c = " + abc);

		double acb = a + c + b;
		System.out.println("a + c + b = " + acb);
	}
}

