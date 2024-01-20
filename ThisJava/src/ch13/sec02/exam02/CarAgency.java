package ch13.sec02.exam02;

/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 제네릭 타입 p.575
*/
public class CarAgency implements Rentable<Car>{	// 타입 파라미터 P를 Car로 대체

	@Override
	public Car rent() {
		return new Car();		//리턴 타입이 반드시 Car이어야 함
	}
	
}
