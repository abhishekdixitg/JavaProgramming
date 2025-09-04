package M4;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(3, 1);
		vector.add(10);
		vector.add(20);
		vector.add(30);
		System.out.println(vector);
		System.out.println(vector.capacity());

		vector.add(40);

		System.out.println(vector.capacity());
	}
}
