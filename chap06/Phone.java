package chap06;

public class Phone {
	
	protected String owner;
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	public void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}
