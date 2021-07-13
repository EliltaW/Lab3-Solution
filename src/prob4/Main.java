package prob4;

public class Main {
    public static void main(String [] args) {
	Circle cir = new Circle(2.5);
	Triangle tri = new Triangle(1.3 , 3.2);
	Rectangle rec = new Rectangle(3.3 , 2.5);
	System.out.println("Area of a rectangle is " + rec.computeArea());
	System.out.println("Area of a Triangle is " + tri.computeArea());
	System.out.println("Area of a Circle is " + cir.computeArea());

    }
}
