package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 날짜 : 2024/01/11
 * p.790 바이트 배열로 읽기
 * 
 */

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data); // 최대 100byte를 읽고 읽은 바이트는 data에 저장, 읽은 수는 리턴
				if(num == -1) break; // 파일 끝에 도달했을 경우 끝내기
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]); // 읽은 바이트 출력
				}
			}
			
			is.close(); // 배열의 모든 바이트를 출력
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
	}
	
}









