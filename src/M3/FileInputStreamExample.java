package M3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {

		String file = "src/M3/sample.txt";
		try (FileInputStream fis = new FileInputStream(file)) {
			int ch;

			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}
}
