package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {
	
	public static String input(String message) throws IOException  {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(message);
		String c = br.readLine();
		return c;
	}
	
	public static void whosWin(String c, String y) {
		if (c.equals("r") && y.equals("r") || c.equals("p") && y.equals("p") || c.equals("s") && y.equals("s")) {
			System.out.println("무승부");
		}
		if (c.equals("r") && y.equals("s") || c.equals("p") && y.equals("r") || c.equals("s") && y.equals("p")) {
			System.out.println("철수, 승!");
		}
		if (c.equals("r") && y.equals("p") || c.equals("p") && y.equals("s") || c.equals("s") && y.equals("r")) {
			System.out.println("영희, 승!");
		}
	}
	
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String c = input("철수");
		String y = input("영희");
		
		whosWin(c, y);
	}
	
}
