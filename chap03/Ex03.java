package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, sum = 0;
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			a = Integer.parseInt(br.readLine());
			if (a % 2 == 0) {
				sum += a;
			}
		} while (a < 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + a);
	}
}
