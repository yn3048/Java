package ch04.sec03;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : switch문 p.116
 */

public class SwitchExample {

	public static void main(String[] args) {
		int num =  (int)(Math.random()*6) + 1;	//주사위 번호 뽑기 1~6
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
		}
	}
	
}
