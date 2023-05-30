package in.ineuron.shape;

public class Triangle implements Shape {

	private double length;
	private double height;
	private double sideA;
	private double sideB;
	private double sideC;
	

	public Triangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public Triangle(double sideA,double sideB,double sideC) {
	    this.sideA=sideA;
	    this.sideB=sideB;
	    this.sideC=sideC;
	    
	}
	@Override
	public double area() {
	    return ((1/2)*(length*height));	
	}

	@Override
	public double perimeter() {
		return sideA+sideB+sideC;
	}

}
