package M4;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);

		list1.addFirst(5);
		list1.addLast(40);
		System.out.println(list1);

		list1.removeIf(x -> x % 2 == 0);

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("cat");
		list2.add("doug");
		list2.add("mouse");

		LinkedList<String> list3 = new LinkedList<>();
		list3.add("cat");
		list3.add("doug");
		list2.removeAll(list3);
		System.out.println(list2);
	}
}
