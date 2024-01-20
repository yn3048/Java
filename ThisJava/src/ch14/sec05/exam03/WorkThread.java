package ch14.sec05.exam03;

/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 다른 스레드에게 실행 양보 p.584
* 
*/
public class WorkThread extends Thread {

	//필드
	public boolean work = true;
	
	//생성자
	public WorkThread(String name) {
		setName(name);
	}
	
	//메소드
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			}else {
				Thread.yield();
			}
		}
	}
}
