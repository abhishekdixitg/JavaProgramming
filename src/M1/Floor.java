package M1;

public class Floor extends Divide {
	@Override
	public int calculate(int a, int b) {
		int divide = 0;
		if (b != 0) {
			divide = a * b;
		} else {
			System.out.println("Divide by Zero not allowed");
		}
		return divide;
	}
}
