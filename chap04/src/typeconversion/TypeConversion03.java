package typeconversion;

public class TypeConversion03 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;
		
		// x를 y로 나눈 결과를 소수점까지 출력
		
		System.out.println(x/y);

		// x를 y로 나눈 결과를 정수로 출력
		
		System.out.println((int)(x/y));
	}
}
