package ch05.sec05;
/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 문자열 잘라내기 p.161
 * 
 */
public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6); // 인덱스 번호 0~6번까지 출력
		System.out.println(firstNum);	
		
		String secondNum = ssn.substring(7); //인덱스 번호 7번부터~ 끝까지 출력
		System.out.println(secondNum);
	}

}
