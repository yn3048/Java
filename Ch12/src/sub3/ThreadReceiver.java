package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 :Java 채팅 프로그래밍 실습하기
 */
public class ThreadReceiver extends Thread {
	
	private Socket socket;
	
	public ThreadReceiver(Socket socket) {
		this.socket = socket;
	}

	
	@Override
	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg == null) {
					break;
				}
				
				System.out.println(msg);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}








