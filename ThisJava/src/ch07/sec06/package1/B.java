package ch07.sec06.package1;

public class B {

	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
// B클래스는 A클래스와 동일한 패키지에 있기 때문에 
// A의 protected 필드, 생성자, 메소드 접근가능