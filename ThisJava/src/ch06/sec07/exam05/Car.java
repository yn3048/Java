package ch06.sec07.exam05;
/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 다른 생성자 호출 p.228
 * 
 */
public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
		//24라인 생성자 호출
		this(model, "은색", 250);
	}
	Car(String model, String color) {
		//24라인 생성자 호출
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
