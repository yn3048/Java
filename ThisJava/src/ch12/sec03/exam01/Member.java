package ch12.sec03.exam01;
/*
 * 날짜 : 2024/01/09
 * p.498 기본 API 클래스 Object
 */
public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return true;
		}
		return false;
	}
	
	

}
