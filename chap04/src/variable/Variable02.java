package variable;

public class Variable02 {
	public static void main(String[] args) {
		final double PI = 3.14;
		int r;
		r = 5;
	
		System.out.print("반지름이 " + r + "인 원의 넓이는 ");
		System.out.print(PI * r * r);
		System.out.print("입니다");
	}
}
