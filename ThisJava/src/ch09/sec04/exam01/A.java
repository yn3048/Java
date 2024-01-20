package ch09.sec04.exam01;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 로컬 클래스 p.402
 */

public class A {

	//생성자
	A() {
		//로컬 클래스 선언
		class B {}
		
		//로컬 객체 생성
		B b = new B();
	}
		//메소드
		void method() {
			//로컬 클래스 선언
			class B {}
			
			//로컬 객체 생성
			B b = new B();
		
	}
}
