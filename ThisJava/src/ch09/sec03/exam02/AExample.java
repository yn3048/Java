package ch09.sec03.exam02;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 정적 멤버 클래스 p.400
 */
public class AExample {

	public static void main(String[] args) {
		//B 객체 생성 및 인스턴스 필드 및 메소드 사용
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B 클래스의 정적 필드 및 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();
	}
}
