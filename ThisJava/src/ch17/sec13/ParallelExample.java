package ch17.sec13;

import java.lang.management.OperatingSystemMXBean;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/*
 * 날짜: 2024/01/21
 * 이름 : 이예나
 * 내용 : 병렬 스트림 사용
 */
public class ParallelExample {

	public static void main(String[] args) {
		Random  random = new Random();
		
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {  			//1어 개의 Integer 객체 저장
			scores.add(random.nextInt(101));		//0~100까지의 숫자 랜덤 생성, score에 저장
	}
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream
				.mapToInt(i -> i.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
		
		Stream<Integer> paralleStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = paralleStream
				.mapToInt(i -> i.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ns");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
