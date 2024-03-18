package loop;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();

		
		while ( num != 0 ) { 

			sum += num;
			
			System.out.print("숫자를 입력하세요 : ");
			num = input.nextInt();
		
		}
		
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}
}
