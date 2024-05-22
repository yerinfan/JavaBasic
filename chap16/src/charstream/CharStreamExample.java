package charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		// 원본 파일 객체
		String orgFilename = "D1_Student.txt";
		// 복사할 파일 객체
		String copiedFilename = "D1_Student_copied.txt";
		
		try {
			// 원본 파일 읽기 위한 fileReader
			FileReader fr = new FileReader(orgFilename);
			// 복사할 파일 쓰기 위한 fileWriter
			FileWriter fw =new FileWriter(copiedFilename); 
			// 한문자씩 복사 메서드
			copyCharData(fr, fw);
			// 문자 배열 복사 메서드
			//copyCharArrData(fr, fw);
			// fileWriter 다 내보내기
			fw.flush();
			// fileWriter 닫기
			fw.close();
			// fileReader 닫기
			fr.close();
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// 만약 파일이 없을시 FileNotFoundException 출력
			System.out.println(e.getMessage());
		}

	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		// 100개의 문자를 저장할 배열 생성
		char[] charArrData = new char[100];
		// 파일 끝에 도달할 때까지 반복
		while (fr.read(charArrData) != -1) {
			// 읽은 문자배열 출력
			System.out.print(charArrData);
			// 읽은 문자 배열 파일에 쓰기
			fw.write(charArrData);
		}
		
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		// 한 문자씩 파일 끝까지 읽는다 반복
		while ((charData = fr.read()) != -1) {
			// 읽은 문자 char로 변환해서 출력
			System.out.print((char)charData);
			// 읽은 문자 파일에 쓰기
			fw.write(charData);
		}
	}

}
