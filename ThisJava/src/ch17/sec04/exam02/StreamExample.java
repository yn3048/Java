package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 배열로부터 스트림 얻기 p.732
 */

public class StreamExample {
	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.println(item + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.println(item + ""));
		System.out.println();
	}
	
}
