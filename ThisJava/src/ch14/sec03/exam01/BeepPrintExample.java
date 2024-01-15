package ch14.sec03.exam01;

import java.awt.Toolkit;

/*
 * 날짜 : 2024/01/15
 * p.596 Thread
 * 
 */
public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();// Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep(); //비프음 발생
			
			//0.5초간 일시정지
			try { Thread.sleep(500);}  catch(Exception e) {}
			
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		
	}
	
}
