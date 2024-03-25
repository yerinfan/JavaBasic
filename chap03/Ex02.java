package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		switch (score) {
		case 1 :
			System.out.println("아주 잘했습니다.");
			break;
		case 2 :
		case 3 :
			System.out.println("잘했습니다.");
			break;
		case 4 :
		case 5 :
		case 6 :
			System.out.println("보통입니다.");
			break;
		default : 
			System.out.println("노력해야겠습니다.");
		}
	}
}
