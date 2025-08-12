package M3;

public class TestSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		MyThreadSynch t1 = new MyThreadSynch(counter);
		MyThreadSynch t2 = new MyThreadSynch(counter);
		MyThreadSynch t3 = new MyThreadSynch(counter);
		MyThreadSynch t4 = new MyThreadSynch(counter);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();

		System.out.println(counter.getIncrement());
	}
}
