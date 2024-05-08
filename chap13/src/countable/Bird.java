package countable;

public class Bird implements Countable {
	
	String name;
	Bird(String name) {
		this.name = name;
	}
	
	void fly() {
		System.out.printf("%s가 날아간다.\n", name);
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}

}
