package ch14.sec06.exam02;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : wait()와 notify()를 이용한 스레드 제어
 * 
 */

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();	//공유 작업 객체 생성
		
		ThreadA threadA = new ThreadA(workObject);	//작업 스레드 생성 및 실행
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
