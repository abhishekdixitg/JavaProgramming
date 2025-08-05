package M3;

class TestThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		TestThread t1 = new TestThread();

		System.out.println();
		TestThread t2 = new TestThread();
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName());
		}

		t1.start();
		t2.start();
	}
}
