package chap07;

abstract class Controller {
	boolean power;
	void show(){
		if (power == true)
			System.out.println(getName() + "가 켜졌습니다.");
		else
			System.out.println(getName() + "가 꺼졌습니다.");
	}
	
	public Controller(boolean power) {
		this.power = power;
	};
	
	abstract String getName();
	
}

class TV extends Controller {

	public TV(boolean power) {
		super(power);
	}
	public String getName() {
		return "TV";
	}
}

class Radio extends Controller {
	
	public Radio(boolean power) {
		super(power);
	}
	public String getName() {
		return "라디오";
	}
}


public class ControllerTest {

	public static void main(String[] args) {
	 Controller[] c = {	new TV(false), new Radio(true) };
	 
	 for (Controller controller : c)
		 controller.show();
	}

}
