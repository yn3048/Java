package Test5;



//인터페이스: 극단적으로 동일한 목적 하에 동일한 기능을 보장하게 하기 위함!
//자바의 다형성을 이용하여  개발코드 수정을 줄이고 유지보수성을 높인다!
//아래 연습문제 에서는 Shape라는 인터페이스를 생성해서 Circle클래스와 Rectangle클래스에서 
//implements 키워드를 통해 interface 구현
//calcArea() 메소드를 여러 클래스에서 다양하게 사용하기 위함 => 다형성

interface Shape {
	public double calcArea();
}


class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return width * height;
	}
}


public class Test10 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		System.out.print("원 넓이 : ");
		System.out.println(circle.calcArea());
		
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		System.out.print("직사각형 넓이 : ");
		System.out.println(rectangle.calcArea());
		
	}
}


















