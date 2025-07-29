package M2;

public interface vehicle {
	static void stop() {
		System.out.println("Vehicle stopped");
	}

	default void start() {
		System.out.println("Vehicle started");
	}

}
