package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			
			byte [] array = {10, 20, 30, 40, 50};
			
			os.write(array, 1, 3); // 인덱스 1번부터 3개까지만 출력
			
			System.out.println("array : " + array);
			
			os.flush(); 
			os.close();
		} catch( IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
	
}
