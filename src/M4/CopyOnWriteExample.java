package M4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {
	public static void main(String[] args) {
		List<String> list1 = new CopyOnWriteArrayList<>();
		list1.add("Apple");
		list1.add("Oranges");

		for (String val : list1) {
			if (val.equals("Oranges")) {
				list1.add("bannana");
			}
		}
		System.out.println(list1);

		Thread readThread = new Thread(() -> {
			while (true) {
				for (String val : list1) {
					System.out.println(val);
				}
			}
		});
		Thread writeThread = new Thread(() -> {
			list1.add("Abcd");
		});
		readThread.start();
		writeThread.start();

	}
}
