package ch04.sec04;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : for문 p.127
 */

public class MultiplicationTableExample {

	public static void main(String[] args) {
		for (int m =2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
	}
	
}
