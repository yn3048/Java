package sub1;
/*
 * 날짜 : 2024/01/02
 * 이름 : 이예나
 * 내용 : JAVA 클래스 실습하기
 */
public class Car {
	
	//속성(필드)
	String name;
	String color;
	int speed;
	
	//기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}
}
