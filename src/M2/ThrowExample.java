package M2;

public class ThrowExample {
	public void divide(int a, int b) {
		int c = 0;
		if (b == 2) {
			throw new ArithmeticException("Divide by two not allowed");
		}
		c = a / b;
		System.out.println(c);
	}
}
