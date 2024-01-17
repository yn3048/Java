package ch06.sec07.exam04;
/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 생성자 오버로딩 p.225
 * 
 */
public class Car {

	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {} // 생성자1
	
	Car(String model) {
		this.model = model;	//생성자2
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;		//생성자3
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;		//생성자4
	}
}
