package M2;

import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		TryCatch exc = new TryCatch();
		exc.add(10, 0);

		TryCatch2 catch2 = new TryCatch2();

		try {
			catch2.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ThrowExample throwEx = new ThrowExample();
		try {
			throwEx.divide(5, 2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("This will always execute");
		}

	}
}
