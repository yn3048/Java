package ch04.sec02;
/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : if문 p.116
 */
public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		
		// 1~6 숫자 출력
		// math.random() 0.0~1 사이의 값 (1은 포함X) 출력
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}
	
}
