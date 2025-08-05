package M3;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class TestStates {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(1000);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
	}
}
