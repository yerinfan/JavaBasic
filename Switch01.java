package select;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//숫자 입력 받기
		int num = input.nextInt();
		int odd = num % 2;
		
		switch (odd) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		}
	}
}
