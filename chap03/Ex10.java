package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("양의 정수를 입력하세요 : ");
		 int num = Integer.parseInt(br.readLine());
		 
		 if (isPrime(num)) {
			 System.out.println(num + "는 소수입니다.");
		 } else 
			 System.out.println(num + "는 소수가 아닙니다.");
			 
	 }
		 
		
	static boolean isPrime(int n) {
				
			for (int i = 2; i < n; i++) {
				if (n % i == 0 ) {
					return false;
					}
			}
				return true;
	}
}
		 
	 

