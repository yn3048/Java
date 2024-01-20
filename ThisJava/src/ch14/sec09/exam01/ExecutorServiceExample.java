package ch14.sec09.exam01;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 스레드 풀 종료 p.628
 * 
 */

public class ExecutorServiceExample {

	public static void main(String[] args) {
		//스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//작업 생성과 처리 요청
		//스레드풀 종료
		executorService.shutdown();
		System.out.println("스레드풀 종료..");
	}
}
