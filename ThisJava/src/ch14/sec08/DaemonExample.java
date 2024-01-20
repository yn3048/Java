package ch14.sec08;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 데몬 스레드 p.625
 * 
 */
public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); 	//AutoSaveThread를 데몬 스레드로 만듦
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("메인 스레드 종료");
	}
}
