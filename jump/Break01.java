package jump;

import java.util.Scanner;

public class Break01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		while (true) {
			System.out.println("숫자 입력 : ");
			num = input.nextInt();
			if (num > 0) break;
			System.out.println("0보다 큰 숫자를 입력하세요.");
		}
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}
}
