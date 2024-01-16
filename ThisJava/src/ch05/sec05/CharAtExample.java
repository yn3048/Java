package ch05.sec05;
/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 문자 추출 p.158
 * 
 */
public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241231243";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
	
}
