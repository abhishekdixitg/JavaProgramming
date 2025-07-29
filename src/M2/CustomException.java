package M2;

import java.util.logging.Logger;

public class CustomException {
	private static final Logger log = Logger.getLogger(CustomException.class.getName());

	public static void main(String[] args) {
		try {
			validateAge(5);
		} catch (Exception e) {

		}
	}

	static void validateAge(int age) throws CustomExceptionExample {
		if (age < 18) {
			throw new CustomExceptionExample("Age should be greater than 18");
		}
		System.out.println("Age is:: " + age);
	}
}

class CustomExceptionExample extends Exception {
	CustomExceptionExample(String message) {
		super(message);
	}
}
