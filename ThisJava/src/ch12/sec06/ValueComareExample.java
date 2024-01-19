package ch12.sec06;
/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 포장값 비교 클래스
 */

public class ValueComareExample {
	public static void main(String[] args) {
		//-128~127 초과값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " + obj1.equals(obj2));
		
		//-128~127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: "+ (obj3 == obj4));
		System.out.println("equals: " + obj3.equals(obj4));
		
	}
	
}
