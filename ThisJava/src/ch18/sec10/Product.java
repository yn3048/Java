package ch18.sec10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 날짜 : 2024/01/21
 * p.809 객체 스트림
 */
public class Product implements Serializable {
	private static final long serialVersionUID = -621812868470078544L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {return name + ": " + price; }
}
