package classtest;

public class Circle {
	private double radius;
	final double PI = 3.14;
	private double area;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	void calArea() {
		area = PI * radius * radius;
	}
	
	double getArea() {
		return area;		
	}
	
	void show() {
		System.out.printf("반지름은 = %.2f, 면적 = %.2f\n", radius, area);
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}
