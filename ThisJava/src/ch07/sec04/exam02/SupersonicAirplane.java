package ch07.sec04.exam02;
/*
 * 내용 : 상속 , 오버라이딩 (Override)
 * 
 */
public class SupersonicAirplane extends Airplane {

	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	//상태 필드 선언
	public int flyMode = NORMAL;
	
	
	//메서드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
	
	
}
