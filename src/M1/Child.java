package M1;

public class Child extends Parent {

	Child(int age, String name) {
		super(age, name);
		System.out.println("Inside Child");
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

}
