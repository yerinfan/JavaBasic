package chap02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = input.nextInt();
		
		System.out.println(i % 4 == 0);
		System.out.println(i % 5 == 0);
		System.out.println(i % 4 == 0 || i % 5 == 0);
		System.out.println(i % 4 == 0 && i % 5 == 0);
	}
}
