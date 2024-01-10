package ch12.sec03.exam03;
/*
 * 날짜 : 2024/01/09
 * p.504 객체 문자정보
 */
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}
	
}
