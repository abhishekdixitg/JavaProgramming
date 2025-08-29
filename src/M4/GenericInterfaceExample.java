package M4;

public class GenericInterfaceExample<T> implements Box<T> {

	@Override
	public void add(T item1) {
		System.out.println(item1);

	}

}
