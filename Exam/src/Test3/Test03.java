package Test3;


class Car{
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;   
		this.price = price;  //Car라는 생성자 속성 초기화
	}
	
	public void drive() {
		System.out.println(name+ "운행 중...");
	}
	
	public void info() {
		System.out.println("브랜드 :"+brand);
		System.out.println("차량명 : "+name);
		System.out.println("가  격 :"+price);
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		Car sonata = null; //참조변수 초기화
		Car bmw    = null; //참조변수 초기화
		
		sonata = new Car("현대","소나타",3000); 
		bmw	   = new Car("BMW","520d",5000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
	}
	
}






