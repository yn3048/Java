package ch16.sec05.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 메소드 참조 p.707
 */

public class Computer {

	public static double staticMethod(double x, double y) {
		return x + y;
	}
	
	public double instanceMethod(double x, double y) {
		return x * y;
	}
}
