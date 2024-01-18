package ch03.sec09;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 비트 이동 연산자  p.99
 * 
 */
public class BitcShiftExample {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 <<3;
		int result2 = num1 * (int) Math.pow(2, 3);	// Math.pow메소드  2의 3승 double값 산출, int로 캐스팅
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		
		int num2 = -8;
		int result3 = num2 >>3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: "+ result3);
		System.out.println("result4: "+ result4);
	 }
	
}
