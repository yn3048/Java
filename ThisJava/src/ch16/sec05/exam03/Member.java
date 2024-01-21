package ch16.sec05.exam03;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 생성자 참조 p.712
 */
public class Member {

	private String id;
	private String name;
	
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	
	@Override
	public String toString() {
		String info = "{ id : " + id + " , name: " + name + "}";
		return info;
	}
}









