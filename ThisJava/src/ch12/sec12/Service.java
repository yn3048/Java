package ch12.sec12;

import ch12.sec12.PrintAnnotation.Printannotation;

public class Service {

	@Printannotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@Printannotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@Printannotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
