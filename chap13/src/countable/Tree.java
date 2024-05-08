package countable;

public class Tree implements Countable {

	String name;
	
	Tree(String name) {
		this.name = name;
	}
	
	void ripen() {
		System.out.printf("%s가 잘 익었다.\n", name);
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다.");

	}

}
