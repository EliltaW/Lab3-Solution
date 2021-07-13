package prob4;

public class Triangle {
	private double base;
	private double height;
	double area;
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double computeArea() {
		area = 0.5 * base * height;
		return area;
	}
}
