package chap03;

public class Ex09 {
	
	
	public static void foo(String message) {
		
		System.out.println(message);
	}
	
	public static void foo(String message, int a) {
		
		System.out.println(message + " " + a);	
	}
	
	public static void foo(String message, int a, int b) {
		
		System.out.println(message + " " + a + " " + b);	
	}
	
	
	
	public static void main(String[] args) {
		
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");		
		
	}
}
