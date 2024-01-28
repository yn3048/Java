package array.ex;

public class ArrayEx1Ref {

	
	//배열 사용해서 개선하기
	public static void main(String[] args) {
		
		int[] students = {90, 80, 70, 60, 50};
		int total = 0;
		
		
//		for(int i = 0; i < students.length; i++) {
//			total += students[i];
//		}
		//for-each 문 사용하기
		for (int student : students) {
			total += student;
		}
		
		double average = (double) total / 5;
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average);
	}
}
