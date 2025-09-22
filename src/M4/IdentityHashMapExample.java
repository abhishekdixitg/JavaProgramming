package M4;

import java.util.IdentityHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> studentMap = new IdentityHashMap<>();

		String key1 = new String("key1");
		String key2 = new String("key1");

		studentMap.put(key1, 101);
		studentMap.put(key2, 102);

		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		Set<Entry<String, Integer>> studentSet = studentMap.entrySet();

		for (Entry<String, Integer> linkedData : studentSet) {

			System.out.println(linkedData.getKey() + ": " + linkedData.getValue());
		}
	}
}
