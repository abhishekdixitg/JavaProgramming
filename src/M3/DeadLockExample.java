package M3;

public class DeadLockExample {
	public static final Object obj1 = new Object();
	public static final Object obj2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread 1 is holding lock on obj1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 waiting for lock on obj2");
				synchronized (obj2) {
					System.out.println("Thread 1 acquired lock on obj2");
				}

			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println("Thread 2 is holding lock on obj2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2 waiting for lock on obj1");
				synchronized (obj1) {
					System.out.println("Thread 2 acquired lock on obj1");
				}

			}
		});
		t1.start();
		t2.start();
	}
}
