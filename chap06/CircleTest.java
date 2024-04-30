package chap06;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
		
		circle.show();
		cc.show();
	}

}
