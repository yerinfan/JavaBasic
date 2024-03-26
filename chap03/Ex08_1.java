package chap03;

public class Ex08_1 {
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
		
		return switch (n) {
		case 1 -> 1;
		default -> n * factorial(n-1);
		};
		
	}
	
	
}
