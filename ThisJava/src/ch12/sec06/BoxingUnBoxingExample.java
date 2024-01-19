package ch12.sec06;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 포장 클래스
 */


public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
							//intValue()메소드는 Integer 객체 내부의 int 값을 리턴한다.
		System.out.println("value: " + obj.intValue());
		
		//Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 Unboxing
		//obj는 100과 연산되기 전에 언박싱 된다.
		int result = obj + 100;
		System.out.println("result: " + result);
	}
	
}
