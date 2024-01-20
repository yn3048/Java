package ch14.sec07.exam03;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : interrupt() 메소드 이용 p.622
 * 
 */
public class PrintThread extends Thread {

	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break; 		//interrupt() 메소드가 호출되었다면 while문을 빠져나감
			}
		}
	}
}
