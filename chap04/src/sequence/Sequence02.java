package sequence;

import java.util.Scanner;

public class Sequence02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요(원) : ");
		int change = input.nextInt();
		int num_500 = change / 500;
		int num_100 = (change % 500) / 100;
		
		System.out.println(">> 500원 동전 " + num_500 + "개와 100원 동전" + num_100 + "개가 필요합니다.");
		
		
		
	}	
}
