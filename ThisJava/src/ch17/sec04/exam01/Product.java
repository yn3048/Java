package ch17.sec04.exam01;

/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : 컬렉션으로부터 스트림 얻기 p.730
 */


public class Product {
	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
		
	}
	
	public int getPno() { return pno;}
	public String getName() {return name;}
	public String getCompnay() {return company;}
	public int getPrice() {return price;}
	
	
	// append()메소드 => 문자열 마지막에 이어 붙이기
	//				=> 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가함
	@Override
	public String toString() {
		return new StringBuilder()
			.append("{")
			.append("pno:" + pno + ", ")
			.append("name:" + name + ", ")
			.append("company:" + company+ ", ")
			.append("price:" + price)
			.append("}")
			.toString();
			
	}
	

}












