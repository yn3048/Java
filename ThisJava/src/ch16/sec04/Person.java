package ch16.sec04;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 리턴값이 있는 람다식 p.702
 */

public class Person {

	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과: " + result);
	}
	
}
