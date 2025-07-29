package M2;

import shape.shape;

public class Rectangle implements shape {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2 * (length + width);

	}
}
