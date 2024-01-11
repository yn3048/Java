package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 날짜 : 2024/01/11
 * p.786 데이터 입출력 - 바이트 입력
 * 
 */
public class ReadExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read(); // 1byte씩 읽기
				
				if(data == -1) break; // 파일 끝에 도달했을 경우 끝내기
				System.out.println(data);
				
			}
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
	
}









