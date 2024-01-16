package ch05.sec05;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 문자열 찾기 p.163
 * 
 */
public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String subString = subject.substring(location); // location 인덱스 번호부터 문자열 출력
		System.out.println(subString);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
	
	
}
