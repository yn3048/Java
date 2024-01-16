package sub1;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 자바 함수형 프로그래밍 실습
 * 
 * 함수형 프로그래밍
 *  - 프로그래밍 단위를 함수(메서드) 위주로 프로그래밍하는 패러다임
 *  - 함수형 프로그래밍을 람다식으로 구현
 */

interface A {
	public void hello();
}

class B implements A {

	@Override
	public void hello() {
		System.out.println("Hello World...");
	}
	
}

public class FunctionalTest {

	public static void main(String[] args) {
		
		// 객체지향 프로그래밍
		A a1 = new B();
		a1.hello();
		
		// 익명 객체(클래스 구현 없이 인터페이스를 바로 객체 생성)
		A a2 = new A() {
			
			@Override
			public void hello() {
				System.out.println("Hello World...");
				
			}
		};
		
		a2.hello();
		
		
		// 함수형 프로그래밍
		
		//A 자리에 무조건 인터페이스가 위치해야함
		A a3 = () -> {System.out.println("Hello World...");}; 
		a3.hello();
		
		
	}
	
}















