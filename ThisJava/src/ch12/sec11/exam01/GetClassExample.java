package ch12.sec11.exam01;

import ch06.sec06.exam01.Car;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 패키지와 타입 정보 얻기 p.548
 */


public class GetClassExample {

	public static void main(String[] args) throws Exception {
		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}
}
