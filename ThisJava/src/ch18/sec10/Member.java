package ch18.sec10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 날짜 : 2024/01/21
 * p.809 객체 스트림
 */
public class Member implements Serializable {
	private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() { return id + ": " + name; }
}
