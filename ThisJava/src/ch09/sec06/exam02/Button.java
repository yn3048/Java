package ch09.sec06.exam02;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 중첩 인터페이스 p.410
 */


public class Button {

	//정적 멤버 인터페이스
	public static interface ClickListner {
		//추상 메소드
		void onClick(); 
	}
	
	
	//필드 
	private ClickListner clickListner;
	
	//메소드
	public void setClickListner(ClickListner clickListner) {
		this.clickListner = clickListner;
	}
}
