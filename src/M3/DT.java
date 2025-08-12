package M3;

public class DT {
	public static void main(String[] args) {
		MyTestThread t1 = new MyTestThread();
		// Thread t1 = new Thread("Thread1", testThread);
		t1.setDaemon(true);
		MyTestThread t2 = new MyTestThread();
		t1.start();
		t2.start();
		System.out.println("Main Done");

	}
}

class MyTestThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("Hello");
		}

	}

}
