package ch18.sec08;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2024/01/21
 * p.803 기본 타입스트림
 */

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//DateOutputStream 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.write(2);
		
		dos.flush(); dos.close(); fos.close();
	}
}




