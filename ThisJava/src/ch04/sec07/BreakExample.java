package ch04.sec07;



/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : break문 p.134
 */

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
}
