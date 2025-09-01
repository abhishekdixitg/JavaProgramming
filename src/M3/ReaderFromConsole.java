package M3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderFromConsole {
	public static void main(String[] args) {

		String fileName = "src/M3/consoleoutput.txt";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				FileOutputStream fos = new FileOutputStream(fileName)) {
			System.out.println("Enter text to write into the file:");
			String input = br.readLine(); // read one line of input

			// Write to file
			fos.write(input.getBytes());

			System.out.println("Data written to " + fileName + " successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
