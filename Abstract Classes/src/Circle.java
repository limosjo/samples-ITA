
public class Circle extends Shape {

	public static final double PI=3.14159265358979323846;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return PI * radius * radius;
	}

	@Override
	public double circumference() {
		return 2 * PI * radius;
	}

}
