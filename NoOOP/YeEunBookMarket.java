package NoOOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YeEunBookMarket {

	static final int NUM_MENU = 4;

	public static void main(String[] args) throws IOException {

		displayWelcome();

		boolean quit = false;
		while (!quit) {
			int menu = displayGetMenu();

			switch (menu) {
			case 1:
				menuBookList();
				break;
			case 2:
				menuCartList();
				break;
			case 3:
				menuAddCartItem();
				break;
			case 4:
				menuClearCart();
				break;
			case 0:
				menuExit();
				quit = true;
				break;
			default:
				menuWrongNum();

			}
		}

	}

	static void displayWelcome() {
		String welcome = "*****************************************\n" + "*      Welcome to YeEun Book Market     *\n"
				+ "*****************************************";
		System.out.println(welcome);
	}

	static int displayGetMenu() {
		String menuStr = "=========================================\n" + "1. 도서 목록 보기\n" + "2. 장바구니 보기\n"
				+ "3. 장바구니에 도서 추가\n" + "4. 장바구니 비우기\n" + "0. 종료\n" + "=========================================\n";

		System.out.println(menuStr);
		System.out.print(">> 메뉴 선택 : ");

		Scanner input = new Scanner(System.in);

		return input.nextInt();

	}

	static void menuBookList() {
		String message = ">> 도서 목록";
		String line = "----------------------------------------";
		System.out.println(message);
		System.out.println(line);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(bookList[i][j] + ", ");
			}
			System.out.println();
		}

		System.out.println(line);
	}

	static void menuCartList() {
		String message = ">> 장바구니 보기";
		String line = "----------------------------------------";

		if (numCartItem != 0) {
			System.out.println(message);
			System.out.println(line);

			// 책 보유 목록
			for (int i = 0; i < 3; i++) {
				if (cartList[i] != 0) {
					System.out.print(cartList[i] + "권, ");
					for (int j = 0; j < 5; j++) {
						System.out.print(bookList[i][j] + ", ");
					} System.out.println();
				}
			}
	
			System.out.println(line);
		} else {
			System.out.println(">> 장바구니가 비어있습니다.");
		}
	}

	static void menuAddCartItem() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		menuBookList();

		System.out.print(">> 추가할 도서 ID 입력(ID 포함) : ");
		String addBookID = br.readLine();

		for (int i = 0; i < 3; i++) {
			if (bookList[i][0].equals(addBookID)) {
				System.out.print(">> 장바구니 추가 : " + bookList[i][1] + "\n");
				cartList[i]++;
				numCartItem++;
				return;
			}

		}

		System.out.println("없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
		menuAddCartItem();
	

	}

	static void menuClearCart() {
		if (numCartItem != 0) {
			for (int i = 0; i < 3; i++) {
				cartList[i] = 0;
			}
			numCartItem = 0;
			System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
		} else {
			System.out.println(">> 장바구니가 비어 있습니다.");
		}
	}

	static void menuExit() {
		System.out.println(">> YeEun Book Market을 종료합니다. ");
	}

	static void menuWrongNum() {
		System.out.println("없는 메뉴입니다. 0번부터 " + NUM_MENU + "번까지의 메뉴 중에서 선택하세요.");
	}

	static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
			{ "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
			{ "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } };

	static int[] cartList = { 0, 0, 0 };
	static int numCartItem = 0;

}
