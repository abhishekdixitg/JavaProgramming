package M1;

public class Employee {

	private String id;
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id) {
		super();
		id = id;
		salary = 2000;
	}

	public Employee(String id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

}
