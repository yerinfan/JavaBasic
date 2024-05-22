package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		// 카피 할 사진 불러오기
		String orgFilename = "Curi_01.jpg"; 
		// 
		String copiedFilename = "Curi_01_copied.jpg";
		try {
			// 원본 파일 읽는 fileinputstream 클래스 객체 생성
			FileInputStream fis = new FileInputStream(orgFilename);
			// 파일 복사를 위한 fileoutputstream 클래스 객체 생성
			FileOutputStream fos = new FileOutputStream(copiedFilename);
			// 한바이트씩 복사하는 메서드 
			//scopyEachOneByte(fis, fos);
			
			// kb단위로 복사하는 메서드
			copyEachKByte(fis, fos);
			// fileoutputstream 데이터 모두 출력
			fos.flush();
			// fileoutputstream 닫기
			fos.close();
			// fileinputsteam 닫기
			fis.close();
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// 파일이 없을시 filenotfoundexception 문구 출력
			System.out.println(e.getMessage());
		}	
	}

	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int byteInput;
		while ((byteInput = fis.read()) != -1) {
			fos.write(byteInput);
		}
	}
	
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024];
		while (fis.read(kbInput) != -1) {
			fos.write(kbInput);
		}
	}

}
