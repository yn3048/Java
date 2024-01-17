package ch05.sec10;

/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 배열 항목 반복을 위한 향상된 for 문 p190
 * 
 */
public class AdvancedForExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
		
		//배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {	//5개의 항목이 한 번씩 score 변수에 저장되고 sum에 누적됨(반복횟수:5)
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
	
}
