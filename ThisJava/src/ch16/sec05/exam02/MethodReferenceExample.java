package ch16.sec05.exam02;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 매개변수의 메소드 참조 p.710
 */

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String :: compareToIgnoreCase);
	}
}
