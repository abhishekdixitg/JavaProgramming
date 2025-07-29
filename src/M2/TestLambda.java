package M2;

public class TestLambda {
	public static void main(String[] args) {

		Calculator calculate = (a, b) -> a + b;

		int sum = calculate.compute(10, 20);
		System.out.println(sum);

	}
}
