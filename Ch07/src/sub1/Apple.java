package sub1;

//Apple은 암시적으로 Object를 상속받고있음
public class Apple {

	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Apple [hashcode="+hashCode()+" country=" + country + ", price=" + price + "]";
	}
	
	
}
