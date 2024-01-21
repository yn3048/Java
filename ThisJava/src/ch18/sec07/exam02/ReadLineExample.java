package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 날짜 : 2024/01/21
 * p.803 성능 향상 스트림 Buffer
 */

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("src/ch18/sec07/exam02/ReadLineExample.java")
				);// FileReader에 BufferedReader 보조 스트림 연결
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); //1행을 읽음
			if(str == null) break;	//더 이상 읽을 내용이 없으면 while문 종료
			System.out.println(lineNo + "\t" + str);
		}
		
		br.close(); //BufferedReader를 닫으면 연결된 FileReader도 닫힘
				
	}
}







