package select;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 ");
		int a = input.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		int b = input.nextInt();
		System.out.print("세번째 숫자를 입력하세요 ");
		
		int c = input.nextInt();
		
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
}
