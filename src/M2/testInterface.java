package M2;

import M1.Dog;

public class testInterface {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Animal greeting = () -> System.out.println("Hello from Anonymous Inner Class");

		greeting.sound();

	}
}
