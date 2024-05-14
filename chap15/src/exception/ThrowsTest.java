package exception;

public class ThrowsTest {

	public static void main(String[] args) {
		method1();
		System.out.println("=== 프로그램 종료 ===");
	}

	static void method1() {
		try {
			method2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void method2() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
