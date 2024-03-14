package chap02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = input.nextInt();
		System.out.println(num + "의 제곱은" + (num * num));
	}
}
