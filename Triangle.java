package chap04;

public class Triangle {

	double a;
	double b;
	double area;
	
	public Triangle (double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double findArea () {
		return a*b/2;
	}
	
	public boolean isSameArea(Triangle t) {
		return t.findArea() == findArea();  	
	}
	
	
}
