package ch07.sec11;
/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 상속 - 봉인된 클래스
 * 
 */
public non-sealed class Manager extends Person   {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
	
}
