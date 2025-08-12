package M3;

public class MyThreadSynch extends Thread {

	private Counter counter;

	MyThreadSynch(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			counter.increment();
		}
	}

}
