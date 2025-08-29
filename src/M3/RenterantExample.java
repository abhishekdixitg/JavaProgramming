package M3;

import java.util.concurrent.locks.ReentrantLock;

public class RenterantExample {
	private static int sharedVariable = 0;

	private static ReentrantLock lock = new ReentrantLock(true);

	public static void increment() {

		lock.lock();
		try {
			sharedVariable++;
			System.out.println(Thread.currentThread().getName() + " counter incremented to: " + sharedVariable);
		}

		finally {

			lock.unlock();
		}
	}

	public static void main(String[] args) {

		Runnable task = () -> {
			for (int i = 1; i < 3; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();
	}
}
