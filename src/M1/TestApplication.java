package M1;

public class TestApplication {

	public static void main(String[] args) {
		Math math = new Math();
		int sum = math.calculate(4, 2);
		System.out.println(sum);

		math.calculate(4, 2, 4);

		Divide divide = new Floor(); // Dynamic method dispatch
		int div = divide.calculate(6, 3);
		System.out.println(div);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Abhishek");
		}

		for (int val : arr) {
			System.out.println("Abhishek");
		}

	}
}
