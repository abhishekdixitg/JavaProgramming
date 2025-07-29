package M2;

import utils.MathUtils;

public class TestMathUtils {
	public static void main(String[] args) {
		MathUtils math = new MathUtils();
		int result = math.add(10, 15);
		System.out.println("The sum is:" + result);
	}
}
