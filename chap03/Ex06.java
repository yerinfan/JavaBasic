package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("철수 : ");
		String a = br.readLine();
		System.out.println("영희 : ");
		String b = br.readLine();
		
		if (a.equals("r") && b.equals("r") || a.equals("p") && b.equals("p") || a.equals("s") && b.equals("s")) {
			System.out.println("무승부");
		}
		if (a.equals("r") && b.equals("s") || a.equals("p") && b.equals("r") || a.equals("s") && b.equals("p")) {
			System.out.println("철수, 승!");
		}
		if (a.equals("r") && b.equals("p") || a.equals("p") && b.equals("s") || a.equals("s") && b.equals("r")) {
			System.out.println("영희, 승!");
		}
	}
}
