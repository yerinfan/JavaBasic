package countableAb;

public class Tree extends Countable {

	Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}

	void ripen() {
		System.out.printf("%d그루 %s가 잘 익었다.\n", num, name);
	}
}
