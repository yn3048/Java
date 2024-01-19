package ch12.sec05;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : StringBuilder 클래스
 */


public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")		//문자열을 끝에 추가
				.insert(0, "ABC")	//문자열 지정 위치에 추가 
				.delete(3, 4)		//문자열 일부를 삭제
				.toString();		//완성된 문자열을 리턴
		System.out.println(data);
	}
	
}
