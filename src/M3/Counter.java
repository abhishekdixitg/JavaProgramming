package M3;

public class Counter {

	int counter = 0;

	public int getIncrement() {
		return counter;
	}

	public void increment() {
		synchronized (this) {
			counter++;
		}

	}
}
