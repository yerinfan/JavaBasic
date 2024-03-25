package chap03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int a = 1; a < 18; a++) {
			
			for (int b = 1; b < 18; b++) {
				
				for (int c = 1; c < 18; c++) {
				if (a*a + b*b == c*c) {
					System.out.print("(" + a + ", " + b + ", " + c + ") ");
				}
				}
			}
		}
	}
}
