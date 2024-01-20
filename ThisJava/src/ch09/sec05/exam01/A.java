package ch09.sec05.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 바깥 멤버 접근 p.406
 */

public class A {

	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;		//(0)
			method1();			//(0)
			//A의 정적 필드와 메소드 사용
			
			field2 = 10;		//(0)
			method2();			//(0)
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			//field1 = 10;		//(x)
			//method1();		//(x)
			//A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	
}








