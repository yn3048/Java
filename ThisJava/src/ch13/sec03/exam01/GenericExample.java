package ch13.sec03.exam01;
/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 제네릭 타입 p.579
*/

public class GenericExample {

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	
	public static void main(String[] args) {
		
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);	// T를 Integer로 대체
		int intValue = box1.get();
		System.out.println(intValue);
		
		//제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동");	//T를 String 으로 대체
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
