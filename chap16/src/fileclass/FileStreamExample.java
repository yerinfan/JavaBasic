package fileclass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamExample {

	public static void main(String[] args) throws IOException {
		// 복사할 파일 원본
		String orgFilename = "D1_Student.txt";
		// 복사 된 파일
		String copiedFilename = "D1_Student_copied.txt";

		// 원본 파일이랑 복사될 파일 객체 생성
		File inFile = new File(orgFilename);
		File outFile = new File(copiedFilename);
		FileReader fr;
		FileWriter fw;

		// 원본 파일이 존재하는가?
		if (inFile.exists()) {
			// 원본 파일 읽기 위한 fileReader
			fr = new FileReader(inFile);
		} else {
			// 원본 파일이 없으면 메세지 출력 후 종료
			System.out.println(orgFilename + "을 찾을 수 없습니다.");
			return;
		}

		// 복사될 파일이 존재하지 않으면 새 파일 생성
		if (!outFile.exists()) {
			outFile.createNewFile();
		} else {
			// 복사될 파일이 있으면 경고 출력
			System.out.println(copiedFilename + "이 존재합니다. 기존 내용이 삭제됩니다.");
		}

		
		 fw = new FileWriter(outFile);
		// 한문자씩 복사 메서드
		copyCharData(fr, fw);
		// 문자 배열 복사 메서드
		// copyCharArrData(fr, fw);
		// fileWriter 다 내보내기
		fw.flush();
		// fileWriter 닫기
		fw.close();
		// fileReader 닫기
		fr.close();
		System.out.println(orgFilename + " 복사가 완료되었습니다.");

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


