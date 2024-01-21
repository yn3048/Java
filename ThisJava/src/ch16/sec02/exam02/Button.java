package ch16.sec02.exam02;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 매개변수가 없는 람다식 p.700
 */

public class Button {

	//정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	//필드
	private ClickListener clickListner;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListner = clickListener;
	}
	public void click() {
		this.clickListner.onClick();
	}
}














