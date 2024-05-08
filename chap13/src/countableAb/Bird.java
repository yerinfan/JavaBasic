package countableAb;

public class Bird extends Countable{

	Bird(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");	
	}
	
	void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}

}
