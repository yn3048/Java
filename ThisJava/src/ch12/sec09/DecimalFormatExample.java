package ch12.sec09;

import java.text.DecimalFormat;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 형식 클래스 p.542
 */

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		//정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		//무조건 소수 첫째 자리까지 표기
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
	}
	
}
