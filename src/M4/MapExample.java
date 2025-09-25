package M4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<>();

		studentMap.put(101, "Student1");
		studentMap.put(102, "Student2");
		studentMap.put(103, "Student3");
		studentMap.put(104, "Student4");
		studentMap.put(105, "Student5");
		System.out.println("HashMap -- > " + studentMap);

		String studName = studentMap.get(102);
		System.out.println(studName);

		Set<Integer> studentKeys = studentMap.keySet();

		// studentMap.putIfAbsent(null, studName);

		for (int key : studentKeys) {
			System.out.println(key);
		}

		Set<Entry<Integer, String>> studentSet = studentMap.entrySet();

		for (Entry<Integer, String> key : studentSet) {

			System.out.println(key.getValue());
		}

		System.out.println(studentMap.containsKey(101));

		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		// Map<String, Integer> linkedMap = new LinkedHashMap<>(13, 0.3f, true);

		linkedMap.put("Apple", 10);
		linkedMap.put("Orange", 20);
		linkedMap.put("Banana", 30);
		linkedMap.put("abc", 30);

		System.out.println("LinkedHashMap --" + linkedMap);
		linkedMap.get("Orange");
		linkedMap.get("Apple");
		Set<Entry<String, Integer>> linkedSet = linkedMap.entrySet();

		for (Entry<String, Integer> linkedData : linkedSet) {

			System.out.println(linkedData.getKey() + ": " + linkedData.getValue());
		}

		Employee emp1 = new Employee("101", "Emp1");

		Employee emp2 = new Employee("101", "Emp1");

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));

	}
}
