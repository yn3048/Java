package ch04.sec02;
/*
 * 날짜 : 2024/01/02
 * p.111
 * if문
 */
public class IfExample {
 
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); // 17라인에 중괄호 블록이 없어서 18라인까지만 영향을 미침
												//=>19라인이 무조건 실행됨
	}
}
