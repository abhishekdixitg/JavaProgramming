package M2;

public class TestLambda {
	public static void main(String[] args) {

		Addition additon = new Addition();
		int addSum = additon.compute(10, 20);
		System.out.println(addSum);

		Calculator addVal = (a, b) -> a + b;

		System.out.println(addVal.compute(20, 30));

	}
}
