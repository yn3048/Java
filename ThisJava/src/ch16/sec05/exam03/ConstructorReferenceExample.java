package ch16.sec05.exam03;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 생성자 참조 p.712
 */
public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new);    //생성자 참조
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);  	//생성자 참조
		System.out.println(m2);
	}
}
