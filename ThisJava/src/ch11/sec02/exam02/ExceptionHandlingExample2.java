package ch11.sec02.exam02;
/*
 * 날짜 : 2024/01/08
 * p.466 예외 처리 
 * 
 */
public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: "+ result);
		} catch(NullPointerException e) {
			
			//예외 정보를 얻는 3가지 방법
			System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
			//System.out.println(e.toString()); //예외의 종류, 발생한 이유 리턴
			//e.printStackTrace(); //예외 발생 지점, 종류, 발생한 이유 리턴 best!!
		} finally {
			System.out.println("[마무리 실행]\n");
			}
		
		}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
		
	}
}
