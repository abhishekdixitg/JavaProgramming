package M3;

class MyThreadStates extends Thread {
	@Override
	public void run() {
		// System.out.println("RUNNING");
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}

	}
}

public class ThreadStates {
	public static void main(String[] args) throws InterruptedException {
		MyThreadStates t1 = new MyThreadStates();
		MyThreadStates t2 = new MyThreadStates();
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());
		t1.sleep(100);
		System.out.println(t1.getState());
		t2.start();

	}
}
