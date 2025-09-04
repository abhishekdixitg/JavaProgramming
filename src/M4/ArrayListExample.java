package M4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(50);
		list1.add(50);

		list1.add(2, 30);

		list1.set(3, 60);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println(list1.size());

		ArrayList<Integer> list2 = new ArrayList<>(1000);
		System.out.println(list2.size());
		list2.add(100);
		Integer[] abc = new Integer[10];
		abc[0] = 80;
		abc[0] = 90;
		List<Integer> list3 = Arrays.asList(abc);
		// list3.add(110);
		System.out.println(list3.getClass());

		Student stud1 = new Student();
		stud1.setId(101);
		stud1.setName("Abhishek");
		Student stud2 = new Student();
		stud2.setId(102);
		stud2.setName("Jitendra");

		Student stud3 = new Student();
		stud3.setId(103);
		stud3.setName("Aarav");

		ArrayList<Student> list5 = new ArrayList<>();
		list5.add(stud1);
		list5.add(stud2);
		list5.add(stud3);
	}
}
