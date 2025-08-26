package M3;

public class DE {

	public static final Object obj1 = new Object();
	public static final Object obj2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread 1: Holding lock1...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1: Waiting for lock2...");
				synchronized (obj2) {
					System.out.println("Thread 1: Acquired for lock2...");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println("Thread 2: Holding lock2...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2: Waiting for lock1...");
				synchronized (obj1) {
					System.out.println("Thread 2: Acquired for lock1...");
				}
			}
		});

		t1.start();
		t2.start();
	}

}
