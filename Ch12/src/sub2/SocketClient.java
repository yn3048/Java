package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 :Java Socket 프로그래밍 실습하기
 */

public class SocketClient {

	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("연결 요청...");
												//localhost , Loopback
			socket.connect(new InetSocketAddress("127.0.0.1", 50001));
			
			System.out.println("연결 성공...");
			
			
			// 데이터 송신(Client-> Server)
			OutputStream os = socket.getOutputStream();
			String msg = "Hello Server!😎";
			
			byte[] msgBytes = msg.getBytes();
			os.write(msgBytes);
			os.flush();
			
			System.out.println("데이터 송신 완료...");
			
			// 데이터 수신(Server -> Client)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String result = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(result);
			
			System.out.println("데이터 수신 완료...🎈");
			
			os.close();
			is.close();
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		
		
		
		System.out.println("Client 종료...");
	}
}
















