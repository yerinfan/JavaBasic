package chap07;

public class Concrete extends Abstract{

	int j;
	
	public Concrete(int i, int j) {
		super(i);
		this.j = j;
	}
	
	void show() {
		System.out.printf("i = %d, j = %d", i, j);
	}
}
