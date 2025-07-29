package M1;

public class Main {
	interface Greeting {
		void sayHello();
	}

	public static void main(String[] args) {
		// Anonymous Inner Class implementing an interface
		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello from Anonymous Inner Class");
			}
		};

		greeting.sayHello();
	}

}
