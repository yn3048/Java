package ch04.sec03;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : Switch문 p.120
 */

public class SwitchNoBreakcaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 8~11 사이의 정수 뽑기
		System.out.println("[현재 시간 : " + time + "시]");
		
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			
			default:
				System.out.println("외근을 나갑니다.");
			
		}
	}
	
}
