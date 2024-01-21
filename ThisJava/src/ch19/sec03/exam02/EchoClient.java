package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/*
 * 날짜 : 2024/01/21
 * 입출력 시스템으로 데이터 주고 받기  p.838 
 */
public class EchoClient {

	public static void main(String[] args) {
		try {
			//Socket 생성과 동시에 localhost의 50001 포트로 연결 요청;
			Socket socket = new Socket("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "나는 자바가 좋아~~";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음:" + receiveMessage);
			//---------------------------------------------------------------------
			
			//연결 끊기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		}catch (Exception e) {
			
		}
	}
}



















