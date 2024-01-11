package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 날짜 : 2024/01/11
 * p.782 데이터 입출력 - 바이트 출력
 * 
 */

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte[] array = { 10, 20, 30};
			
			os.write(array); // 배열의 모든 바이트를 출력
			
			os.flush(); // 버퍼 비우기
			os.close(); // 출력 스트림을 닫아서 사용한 메모리를 해제
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
	
}
