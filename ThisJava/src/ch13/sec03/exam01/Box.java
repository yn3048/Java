package ch13.sec03.exam01;

/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 제네릭 타입 p.579
*/

public class Box<T>{

	//필드
	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	
	//Setter 메소드
	public void set(T t) {
		this.t = t;
	}
	
}
