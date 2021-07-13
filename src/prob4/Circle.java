package prob4;

public class Circle {
	private double radius;
	double area;
	
	public double getRadius() {
		return this.radius;
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double computeArea() {
		area = Math.PI * radius *radius;
		return area;
	}
}
