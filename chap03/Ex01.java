package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int old = Integer.parseInt(br.readLine());
		if (old >= 19) {
			System.out.println("성년");
		}else System.out.println("미성년");
		
	}
}
