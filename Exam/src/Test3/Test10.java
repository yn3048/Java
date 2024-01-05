package Test3;

interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}
//interface => 특수 class, 아무런 구현이 되어있지 않고 모든 메소드가 추상 메소드이다
//interface는 implements하고 여러개 클래스 구현가능
class Customers implements Buyer, Seller  {
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	
	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {

	public static void main(String[] args) {
		Buyer buyer = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}
}
