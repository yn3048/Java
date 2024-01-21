package ch16.sec02.exam02;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 매개변수가 없는 람다식 p.700
 */

public class ButtonExample {

	public static void main(String[] args) {
		//Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");		//매개값으로 람다식 대입
		});
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		//Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");		//매개값으로 람다식 대입
		});
		
		//Calcel 버튼 클릭하기
		btnCancel.click();
	}
}








