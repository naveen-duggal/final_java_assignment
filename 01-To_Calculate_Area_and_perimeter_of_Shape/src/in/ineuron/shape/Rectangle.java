package in.ineuron.shape;

public class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return length * breadth;
	}

	@Override
	public double perimeter() {
		return 2 * (length + breadth);
	}

}
