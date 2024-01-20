package ch14.sec07.exam03;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : interrupt() 메소드 이용 p.622
 * 
 */
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		
		thread.interrupt(); 	//interrupt()메소드 호출
	}
}
