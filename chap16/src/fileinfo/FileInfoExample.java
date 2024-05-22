package fileinfo;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {

	public static void main(String[] args) throws IOException {

		// 이미지 디렉토리 경로와 테스트 파일 경로 지정
		File imgDir = new File("C:/Temp/images");
		File testFile = new File("C:/Temp/test.txt");
		
		 // 이미지 디렉토리가 존재하지 않는 경우 생성
		if(imgDir.exists() == false) { 
			imgDir.mkdirs();
			System.out.println(imgDir.getName() + "을 생성합니다.");
		}
		 // 테스트 파일이 존재하지 않는 경우 생성
		if(testFile.exists() == false) {
			testFile.createNewFile();
			System.out.println(testFile.getName() + "을 생성합니다.");
		}
		 // Temp 디렉토리 객체 생성
		File tempDir = new File("C:/Temp");
		// Temp 디렉토리의 파일 목록 가져오기
		File[] contents = tempDir.listFiles();
		// Temp 디렉토리의 내용을 출력
		System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
		for(File file : contents) {
			System.out.print("\t" + file.getName());
			 // 디렉토리인지 파일인지 확인하여 출력
			if (file.isDirectory()) {
				System.out.print("<DIR>");
			}
			else {
				System.out.print("<"+file.length() + ">");
			}
			System.out.println();
		}

	}

}