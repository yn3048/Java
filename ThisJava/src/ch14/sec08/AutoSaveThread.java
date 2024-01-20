package ch14.sec08;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 데몬 스레드 p.624
 * 
 */

public class AutoSaveThread  extends Thread {

	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
