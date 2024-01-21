package ch16.sec05.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 메소드 참조 p.707
 */

public class Person {

	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
