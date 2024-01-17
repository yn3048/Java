package ch07.sec11;
/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 상속 - 봉인된 클래스
 * 
 */
public final class Employee extends Person  {

	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
	
}
