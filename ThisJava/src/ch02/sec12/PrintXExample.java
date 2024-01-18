package ch02.sec12;


/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 콘솔로 변수값 출력 p.69
 */

public class PrintXExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의가 가격:%d원\n", value);
		System.out.printf("상품의가 가격:%6d원\n", value);
		System.out.printf("상품의가 가격:%-6d원\n", value);
		System.out.printf("상품의가 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:10.2f\n", 10, area);
		
		String name = "홍길동";
		String job  = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
	
}
