package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 내부반복자 p.725
 */


public class ParalleStreamExample {

	public static void main(String[] args) {
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		//병렬 처리
		Stream<String> paralleStream = list.parallelStream(); // 병렬 스트림 얻기
		paralleStream.forEach(name -> {
			System.out.println(name + ": "+ Thread.currentThread().getName());
			
		});
		
	}
}
