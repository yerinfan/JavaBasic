package star;

import java.util.Scanner;

public class Star01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
}
