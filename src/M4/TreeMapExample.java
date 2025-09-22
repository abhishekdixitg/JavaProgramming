package M4;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(30, "Apple");
		treeMap.put(10, "Mango");
		treeMap.put(50, "Banana");
		treeMap.put(20, "Orange");
		treeMap.put(40, "Grapes");

		System.out.println("TreeMap sorted by keys:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
		}

		TreeMap<Integer, String> reverseMap = new TreeMap<>(Collections.reverseOrder());
		reverseMap.putAll(treeMap);

		System.out.println("\nTreeMap sorted in reverse order of keys:");
		for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
		}
	}
}
