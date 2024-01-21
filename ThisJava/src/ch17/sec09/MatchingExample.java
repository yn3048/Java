package ch17.sec09;

import java.util.Arrays;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 요소 조건 만족 여부(매칭) p.751
 * 
 */

public class MatchingExample {

	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2==0);
			System.out.println("모두 2의 배수인가? " +result);
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3==0);
			System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%3==0);
			System.out.println("3의 배수가 없는가? " + result);
	}
}








