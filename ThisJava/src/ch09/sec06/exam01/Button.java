package ch09.sec06.exam01;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 중첩 인터페이스 p.410
 */


public class Button {

	//정적 중첩 인터페이스
	public static interface ClickListner {
		//추상 메소드
		void onClick();
	}
}
