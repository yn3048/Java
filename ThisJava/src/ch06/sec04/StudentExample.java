package ch06.sec04;

/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 객체 생성과 클래스 변수 p.210
 * 
 */
public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
