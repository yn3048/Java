package ch17.sec04.exam03;

import java.util.stream.IntStream;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 숫자 범위로부터 스트림 얻기 p.733
 */
public class StreamExample {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합:" + sum);
	}
	
	
}
