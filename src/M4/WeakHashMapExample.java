package M4;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	public static void main(String[] args) throws InterruptedException {
		Employee empl = new Employee("101", "Emp1");

		System.out.println(empl.getId());

		empl = null;

		System.out.println(empl);

		WeakReference<Employee> empl1 = new WeakReference<>(new Employee("101", "Emp1"));

		Thread.sleep(1000);

		empl1.get();

		WeakHashMap<String, Integer> empl2 = new WeakHashMap<>();

		empl2.put("key", 101);

	}
}
