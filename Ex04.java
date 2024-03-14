package chap02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int second = input.nextInt();
		int hour = second / 3600;
		int minute = (second % 3600) / 600;
		System.out.println(hour + "시간" + minute + "분" + (hour % 600) + "초");
		
				
	}
}
