package ch14.sec06.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 동기화 메소드 및 블록 선언
 * 
 */

public class User2Thread extends Thread {

	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread: ");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50); 	//동기화 블록을 가진 메소드 호출
	}
}
