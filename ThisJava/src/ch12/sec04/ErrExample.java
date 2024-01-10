package ch12.sec04;
/*
 * 날짜 : 2024/01/10
 * p.504 System 클래스
 */
public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("[에러내용]"
					);
			System.err.println(e.getMessage());
		}
	}
}
