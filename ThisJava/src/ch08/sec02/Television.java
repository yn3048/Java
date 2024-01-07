package ch08.sec02;
/*
 * 
 * p.345 구현클래스 선언
 */
public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
}
