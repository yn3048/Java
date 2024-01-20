package ch14.sec06.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 동기화 메소드 및 블록 선언
 * 
 */


public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory1(int momory) {	//동기화 메소드
		this.memory = momory;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() 
							+ ": " + this.memory); // 메모리 값 읽기
	}
	
	public void setMemory2(int memory) {
		this.memory = memory;	//메모리 값 저장
		try {
			Thread.sleep(2000);		// 2초간 일시 정지
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()
							+ this.memory);	//메모리 값 읽기
	}
	
}










