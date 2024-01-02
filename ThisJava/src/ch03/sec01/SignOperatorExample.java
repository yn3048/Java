package ch03.sec01;
/*
 * 날짜 : 2024/01/02
 * p.78
 */
public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: "+ x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: "+y);
	}
}
