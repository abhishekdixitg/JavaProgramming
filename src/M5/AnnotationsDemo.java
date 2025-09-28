package M5;

import M4.Student;

@TestAnnotation("Test")
public class AnnotationsDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student student = new Student();

	}
}
