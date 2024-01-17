package ch07.sec11;
/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 상속 - 봉인된 클래스
 * 
 */
public sealed class Person permits Employee, Manager  {
	//필드
	public String name;
	
	//메소드
	public void work() {
		 System.out.println("하는 일이 결정되지 않았습니다.");
	}
	
}
