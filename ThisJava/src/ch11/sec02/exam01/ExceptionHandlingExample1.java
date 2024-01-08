package ch11.sec02.exam01;
/*
 * 날짜 : 2024/01/08
 * p.466 예외 처리 
 * 
 */
public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: "+ result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThihIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
