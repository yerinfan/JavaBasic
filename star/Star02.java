package star;

import java.util.Scanner;

public class Star02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println("");
		}
	}
}
