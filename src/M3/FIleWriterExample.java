package M3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleWriterExample {
	public static void main(String[] args) {

		String file = "src/M3/output.txt";
		String data = "Writing in Java File";
		try (FileOutputStream fis = new FileOutputStream(file)) {
			int ch;

			fis.write(data.getBytes());

		} catch (FileNotFoundException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}
}
