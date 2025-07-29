package M2;

public class TryCatch {

	public void add(int a, int b) {
		try {
			int c = a / b;
			System.out.println("c");

		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero not allowed");
		} catch (Exception e) {
			System.out.println("Divide by Zero not allowed");
		}
	}
}
