package M3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	int balanceAmount = 1000;
	Lock lock = new ReentrantLock();

	public void withdraw(int amount) {

		try {
			if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				if (balanceAmount > 100) {
					balanceAmount = balanceAmount - amount;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						Thread.interrupted();
					}
					System.out.println(Thread.currentThread().getName() + "Amount withdrawn: " + amount);

				} else {
					System.out.println("No Sufficient Balance");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
