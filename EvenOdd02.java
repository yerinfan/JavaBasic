package method;

import java.util.Scanner;

public class EvenOdd02 {
	
	public static String decideEvenOdd() {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();
		
		if (num % 2 != 0) { 
			return ">> 홀수입니다.";
		} else {
			return ">> 짝수입니다.";
		}
 	}
 
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int bContinue = 1;
			
			while (bContinue != 0) { //1이면 계속, 0이면 멈춤
			
				String result = decideEvenOdd();
				System.out.println(result);
				
				
				System.out.print("계속 하시겠습니까? (0/1) : ");
				bContinue = input.nextInt();
				
			} System.out.println("종료");
			//숫자 입력
			
			// 짝홀판단
			
			//계속? 확인
			
		}

}
