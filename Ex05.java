package chap02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("소문자를 입력하세요 : ");
		char x = input.nextLine().charAt(0);
		
		char A, a;
		int df = (int)'A'-(int)'a';
		System.out.println((char)((int)x + df));
	}
}
