package M4;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class ComparableExample {
	public static void main(String[] args) {
		Employee emp1 = new Employee("101", "emp1");
		Employee emp2 = new Employee("102", "emp2");
		Employee emp3 = new Employee("103", "emp3");
		List<Employee> empList = new ArrayList<>();
		empList.sort(null);
		System.out.println(empList);

		// Map<Integer, String> sortedMap = new TreeMap<>();

		// SortedMap<Integer, String> sortedMap = new TreeMap<>();

		NavigableMap<Integer, String> sortedMap = new TreeMap<>();

		sortedMap.put(91, "Abc");
		sortedMap.put(92, "xyz");
		sortedMap.put(72, "hgf");
		sortedMap.put(78, "jhg");
		System.out.println(sortedMap);

		sortedMap.firstKey();
		sortedMap.headMap(90);
		sortedMap.tailMap(78);

		sortedMap.ceilingEntry(78);
		sortedMap.floorEntry(90);

		Hashtable<Integer, String> hashTable = new Hashtable<>();
		// Synchronized - ThreadSafe
		// No null key or values allowed
		// slow performance in comp with HashMap
		hashTable.put(10, "Ab");
		hashTable.put(20, "bc");

		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap();
		concurrentHashMap.put(10, "xy");
		concurrentHashMap.put(20, "vy");

	}
}
