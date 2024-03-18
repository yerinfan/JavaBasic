package star;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = num; i > 0; i--) {
				for(int s = 0; s < (num - i); s++) {
						System.out.print(" ");			
				}
			for(int j = 1 ; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
	}
}
