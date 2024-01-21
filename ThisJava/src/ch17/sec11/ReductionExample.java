package ch17.sec11;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 요소 커스텀 집계 p.758
 * 
 */
public class ReductionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
			);
		//방법1
		int sum1 = studentList.stream()
							.mapToInt(Student :: getScore)
							.sum();
		//방법2
		int sum2 = studentList.stream()
							.map(Student :: getScore)
							.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}












