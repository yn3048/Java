package ch14.sec03.exam03;

import java.awt.Toolkit;

/*
 * 날짜 : 2024/01/15
 * p.599  Thread 자식 클래스 생성
 * 
 */

public class BeeperPrintExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				
				// 작업 스레드 실행
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
		
			}
		};
	
	
	thread.start(); // 작업 스레드 실행
	
	for(int i=0; i<5 ; i++) {
		System.out.println("띵");
		try {Thread.sleep(500);} catch (Exception e) {}
	}
	
}
	
}










