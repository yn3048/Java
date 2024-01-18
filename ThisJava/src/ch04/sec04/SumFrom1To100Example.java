package ch04.sec04;
/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : for문 p.126
 */

public class SumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
