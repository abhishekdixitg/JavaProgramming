package M1;

public class Parent {

	private String name;
	private int age;

	Parent(int age, String name) {
		System.out.println("Inside Parent");

		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

}
