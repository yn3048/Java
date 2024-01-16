package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 요소 변환(매핑) p.741
 *
 */
public class MapExample {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		//정수 스트림을 실수 스트림으로 변환
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		//기본 타입 스트림을 래퍼 스트림으로 변환
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}
	
}
