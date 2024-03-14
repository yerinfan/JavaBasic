package chap02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double f = input.nextDouble();
		double c = 5 / (double) 9;
	
		System.out.println(c * (f - 32));
	}
}
