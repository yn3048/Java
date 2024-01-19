package ch12.sec11.exam02;


/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 멤버 정보 얻기 p.550
 */


public class Car {

	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car() {
		
	}
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	
}
