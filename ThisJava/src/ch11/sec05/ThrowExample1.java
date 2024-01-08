package ch11.sec05;
/*
 * 날짜 : 2024/01/08
 * p.478 예외 떠넘기기
 * 
 */
public class ThrowExample1 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: "+ e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.Srting2");
	}
}
