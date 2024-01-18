package ch03.sec04;


/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 정확한 계산은 정수 연산으로  p.85
 * 
 */
public class AccurancyExample {

	public static void main(String[] args) {
		int apple =1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: "+ result);
	}	//정확한 계산을 위해서 int 사용해야함.
}
