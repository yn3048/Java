package ch16.sec05.exam03;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 생성자 참조 p.712
 */
public class Person {

	public Member getMember1(Creatable1 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}
}
