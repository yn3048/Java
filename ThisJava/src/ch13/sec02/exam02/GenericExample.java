package ch13.sec02.exam02;

/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 제네릭 타입 p.575
*/
public class GenericExample {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
	
}
