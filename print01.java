package sec04;

public class print01 {
	public static void main(String[] args) {
		String myName = "홍길동";
		int myAge = 20;
		
		System.out.println("이름 : " + myName);
		System.out.println("나이 : " + myAge);
		System.out.println();
	//	System.out.println("이름 : " + myName);
	//	System.out.println("나이 : " + myAge);
		System.out.printf("이름 : " + myName , "나이 : " + myAge);
	}

}
