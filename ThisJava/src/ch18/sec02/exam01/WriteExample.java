package ch18.sec02.exam01;

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
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
	
}
