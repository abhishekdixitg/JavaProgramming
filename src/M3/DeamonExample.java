package M3;

public class DeamonExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("User Thread started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("User Thread end");
		});
		Thread t2 = new Thread(() -> {
			System.out.println("Deamon Thread started");
			try {
				Thread.sleep(1000000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Deamon Thread end");
		});

		t1.start();
		t2.setDaemon(true);
		t2.start();
	}
}
