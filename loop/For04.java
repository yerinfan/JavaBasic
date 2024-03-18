package loop;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = input.nextInt();
		int factorial = 1;
		
		for (int i = num ; i > 1 ; i--) {
			factorial *= i;
			}	
		System.out.println(num + "! = " + factorial);
		}
	
}
