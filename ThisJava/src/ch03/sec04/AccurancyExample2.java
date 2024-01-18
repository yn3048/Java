package ch03.sec04;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 정확한 계산을 위한 정수 계산  p.86
 * 
 */
public class AccurancyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각: "+ result);
		System.out.println("사과 1개에서 남은 양: "+ result/10.0);
	}
	
}
