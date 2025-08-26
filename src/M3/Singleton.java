package M3;

public class Singleton {
	public static Singleton singleton = null;

	public static Singleton getInstance() {

		if (null == singleton) {
			synchronized (singleton) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	private Singleton() {

	}
}
