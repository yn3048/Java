package ch14.sec06.exam02;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : wait()와 notify()를 이용한 스레드 제어
 * 
 */

public class ThreadB extends Thread {

	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {   //공유 작업 객체를 받음
		setName("ThreadB");		//스레드 이름 변경
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB(); //동기화 메소드 호출
		}
	}
	
}
