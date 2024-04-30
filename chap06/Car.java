package chap06;

public class Car extends Vehicle{

	int displacement; //자동차 배기량
	int gears; //자동차 기어단수
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	@Override//
	public void show() {
		System.out.println(color + " " + speed + " " + displacement + " " + gears);
	}
	
}
