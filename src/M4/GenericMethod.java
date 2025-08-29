package M4;

public class GenericMethod {
	int item;

	<T> GenericMethod(T item) {
		this.item = (int) item;
	}

	public <T> void add(T item1, T item2) {
		System.out.println(item1);
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
