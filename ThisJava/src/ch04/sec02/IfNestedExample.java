package ch04.sec02;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : if문 p.117
 */
public class IfNestedExample {

	public static void main(String[] args) {
		
		// random 0.0~1 사이의 수 반환 (1은 포함x)
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade ="B";
			}
		}
		
		System.out.println("학점: " +grade);
	}
	
}
