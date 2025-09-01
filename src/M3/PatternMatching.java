package M3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter email address:");
			String emailId = br.readLine();
			String regex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$";
			boolean val = Pattern.matches(regex, emailId);
			System.out.println(val);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
