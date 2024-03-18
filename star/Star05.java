package star;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
				for(int s = 0; s < (num - i); s++) {
						System.out.print(" ");			
				}
			for(int j = 0 ; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}System.out.println("*");
		}
	}
	}

