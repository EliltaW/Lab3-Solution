package prob4;

public class Rectangle {
	private double width;
	private double length;
	double area;
	 
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length ;
	}
	
	public Rectangle(double width , double length) {
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
		area = length * width;
		return area;
	}
}
