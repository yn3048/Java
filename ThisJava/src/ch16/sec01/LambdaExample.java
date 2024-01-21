package ch16.sec01;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 람다식 p.697
 */

public class LambdaExample {

	public static void main(String[] args) {
		action((x , y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		
		//데이터 처리
		calculable.calculate(x, y);
	}
}










