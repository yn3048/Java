package ch13.sec02.exam03;


/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 제네릭 타입 p.575
*/

public class Box<T> {

	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);	//Object의 equals() 메소드로 content 필드값 비교
		return result;
	}
}
