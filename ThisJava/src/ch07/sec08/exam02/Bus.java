package ch07.sec08.exam02;
/*
 * 날짜 : 2024/01/07
 * p.318 매개변수 다형성
 * 
 */
public class Bus extends Vehicle {

	//메소드 재정의(오버라이딩)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}
