package M4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Lion");
		stack.push("Tiger");
		stack.push("Monkey");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		int index = stack.search("Tiger");
		System.out.println(index);
		stack.add("Adding");

		LinkedList<String> list1 = new LinkedList<>();
		list1.addLast("A");
		list1.addLast("B");
		list1.addLast("C"); // push

		System.out.println(list1);

		list1.removeLast(); // pop

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("item1");
		list2.add("item2"); // push
		System.out.println(list2);
		list2.remove(list2.size() - 1); // pop
	}
}
