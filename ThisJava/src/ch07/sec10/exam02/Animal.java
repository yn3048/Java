package ch07.sec10.exam02;
/*
 * 날짜 : 2024/01/07
 * p.328 추상 메소드와 재정의
 */
public abstract class Animal {

	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	public abstract void sound();
}
