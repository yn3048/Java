package ch08.sec04;
/*
 * 날짜 : 2024/01/07
 * p.348 인터페이스 추상 메소드
 */
public interface RemoteControl {

	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//추상 메소드 =>메소드 선언부만 작성
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
