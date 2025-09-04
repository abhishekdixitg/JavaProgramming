package M4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();

		list1.add(2);
		list1.add(1);
		list1.add(3);
		System.out.println(list1);

		// Collections.sort(list1);
		// list1.sort(null);
		// System.out.println(list1);

		list1.sort(new IntComparator());
		System.out.println(list1);

		List<String> list2 = new ArrayList<>();

		list2.add("batman");
		list2.add("spiderman");
		list2.add("superman");

		System.out.println(list2);

		// list2.sort(new StringLenComparator());
		list2.sort((a, b) -> (b.length() - a.length()));
		System.out.println(list2);

		Student stud1 = new Student();
		stud1.setId(101);
		stud1.setName("Abhishek");
		stud1.setMarks(7);

		Student stud2 = new Student();
		stud2.setId(101);
		stud2.setName("Jitendra");
		stud2.setMarks(8);

		Student stud3 = new Student();
		stud3.setId(101);
		stud3.setName("Nitin");
		stud3.setMarks(9);

		List<Student> list3 = new ArrayList<>();
		list3.add(stud1);
		list3.add(stud2);
		list3.add(stud3);

		// list3.sort(null);
		System.out.println(list3);

		list3.sort(new CustomComparator());

		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i).getMarks());
		}

	}
}

class CustomComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o2.getMarks() - o1.getMarks() < 0) {
			return -1;
		}
		if (o2.getMarks() - o1.getMarks() > 0) {
			return 1;
		}
		return o2.getName().compareTo(o1.getName());
	}

}

class IntComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer int1, Integer int2) {
		// TODO Auto-generated method stub
		return int2 - int1;
	}

}

class StringLenComparator implements Comparator<String> {

	@Override
	public int compare(String val1, String val2) {
		// TODO Auto-generated method stub
		return val2.length() - val1.length();
	}

}
