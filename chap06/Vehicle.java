package chap06;

public class Vehicle {
	
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	public void show() {
		System.out.println(color + " " + speed);
	}
	
	
	
}
