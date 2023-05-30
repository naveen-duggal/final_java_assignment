package in.ineuron.test;
import in.ineuron.shape.*;

public class Test {

	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 7.0;
		double breadth = 4.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());
        System.out.println("***************************************");
		
		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());
		System.out.println("***************************************");
		
		//Triangle area and Perimeter
		double triangleLength=8;
	    double triangleHeight=5;			
		
		double sideA=2.0;
		double sideB=5.0;
		double sideC=4.0;
		
		Triangle t = new Triangle(triangleLength, triangleHeight=5);
		System.out.println("Area of Triangle: " + t.area() );
		
		Triangle t2 = new Triangle(sideA,sideB,sideC);
		System.out.println("Perimeter of Triangle: "+t2.perimeter());		
	}
}

//This code is contributed by Naveen Duggal....

