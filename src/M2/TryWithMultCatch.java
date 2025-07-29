package M2;

import java.sql.SQLException;

public class TryWithMultCatch {

	public void add(int a, int b) {
		try {
			int c = a / b;
			System.out.println("c");
			throw new SQLException();
		} catch (ArithmeticException | SQLException e) {
			System.out.println("Divide by Zero not allowed");
		} catch (Exception e) {
			System.out.println("Divide by Zero not allowed");
		}
	}
}
