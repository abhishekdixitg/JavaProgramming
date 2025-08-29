package M4;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		int[] abc = new int[5];
		ArrayList<String> data = new ArrayList<>();
		data.add("Abhishek");
		data.add("Hello");
		// data.add(20.89);
		// data.add(10);

		String st1 = data.get(0);

		System.out.println(st1);

		Container<String> container1 = new Container<>();
		container1.setId("Abhishek");

		Container<Integer> container2 = new Container<>();
		container2.setId(105);

		System.out.println(container1.getId());
		System.out.println(container2.getId());

		Pair<Integer, String> pair1 = new Pair<>();
		Pair<String, Integer> pair2 = new Pair<>();

	}

}
