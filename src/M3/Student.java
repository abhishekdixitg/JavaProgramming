package M3;

public class Student {

	public static int count = 0;

	static {
		System.out.println("Abhishek");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	private int id;

	private int name;

	Student() {
		count++;
	}

	public int getId() {
		return id;
	}

	public int getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(int name) {
		this.name = name;
	}
}
