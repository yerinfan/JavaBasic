package chap02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.print("원기둥의 밑면 반지름은? ");
		double r = input.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double a = input.nextDouble();
		System.out.println("원기둥의 부피는" + (r * r * PI * a));
		

	}
}
