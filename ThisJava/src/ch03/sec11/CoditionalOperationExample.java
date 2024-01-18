package ch03.sec11;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 삼항 연산자  p.104
 */


public class CoditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade +  "등급입니다.");
	}
	
}
