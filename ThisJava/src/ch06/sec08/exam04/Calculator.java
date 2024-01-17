package ch06.sec08.exam04;

/*
 * 날짜 : 2024/01/17
 * 이름 : 이예나
 * 내용 : 메소드 오버로딩 p240
 */
public class Calculator {

	//정사각형의 넓이
	double areaRetangle(double width) {
		return width * width;
	}
	
	
	// areaReatangle 메소드 오버로딩
	//직사각형의 넓이
	double areaRetangle(double width, double height) {
		return width * height;
	}
	
}
