package chap06;

 class Circle {
	
	int radius;
	
   Circle(int radius) {
		this.radius = radius;
	}
	
	public void show() {
		System.out.printf("반지름이 %d인 원이다.\n", radius);
	}
}

 class ColoredCircle extends Circle {
	String color;
	
	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	
	public void show() {
		System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
	}
}
 
 