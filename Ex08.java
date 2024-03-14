package chap02;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int x = input.nextInt();
		
		System.out.println("각 자릿수의 합 = " + ((x % 10) + ((x / 10) % 10) + ((x / 100) % 10)));
		
		
		
	}
}
