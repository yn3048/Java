package ch14.sec06.exam02;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : wait()와 notify()를 이용한 스레드 제어
 * 
 */

public class ThreadA extends Thread {

	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {	//공유 작업 객체를 받음
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}
