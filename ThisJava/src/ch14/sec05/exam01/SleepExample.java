package ch14.sec05.exam01;

import java.awt.Toolkit;

/*
 * 날짜 : 2024/01/15
 * p.604  주어진 시간동안 일시 정지 sleep()
 * 
 */

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			System.out.println("띵");
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				
			}
		}
				
	}
	
}
