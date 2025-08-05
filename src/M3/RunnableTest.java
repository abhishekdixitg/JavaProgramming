package M3;

public class RunnableTest {
	public static void main(String[] args) {

		TestRunnable runnable = new TestRunnable();
		runnable.run();

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable);
		t1.start();
		t1.setPriority(2);
		t2.start();
		t2.setPriority(7);
		t3.start();
		t3.setPriority(8);
		t4.start();
		t4.setPriority(Thread.MIN_PRIORITY);
	}
}

class TestRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.println("Thread " + i + "is running");
		}
	}

}
