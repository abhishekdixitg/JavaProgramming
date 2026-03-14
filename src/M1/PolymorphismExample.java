package M1;

class child1 extends parent1 {
	@Override
	public double add(double a, double b) {
		return a * b;
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void add(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	public String add(String a, String b) {
		return a + b;
	}
}

class parent1 {
	public double add(double a, double b) {
		return a + b;
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		parent1 p1 = new parent1();
		parent1 p2 = new child1();
		// child1 c1 = new parent1(); // not possible
		p1.add(10, 20);

		p2.add(10, 20);

	}
}
