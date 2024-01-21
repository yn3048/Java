package ch16.sec03;
/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 매개변수가 있는 람다식 p.702
 */
public class Person {

	public void action1(Workable workable) {
		workable.work("홍길동",  "프로그래밍");
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}
}
