package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : Stream p,723
 * 
 * Iterator와 Stream의 차이점 
 *  - 스트림은 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적이다.
 *  - 람다식으로 다양한 요소 처리를 정의할 수 있다.
 *  - 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
 */
public class StreamExample {

	public static void main(String[] args) {
		//set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); //스트림 얻기
		stream.forEach(name -> System.out.println(name)); //람다식 요소 처리 방법
		
	}
}
