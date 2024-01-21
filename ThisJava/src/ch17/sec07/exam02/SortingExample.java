package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : Comparator를 이용한 정렬
 */
public class SortingExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30) );
		studentList.add(new Student("신용권", 10) );
		studentList.add(new Student("유미선", 20) );
		
		//점수를 기준으로 오른차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}













