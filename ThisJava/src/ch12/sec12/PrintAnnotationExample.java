package ch12.sec12;

import java.lang.reflect.Method;

import ch12.sec12.PrintAnnotation.Printannotation;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotations(Printannotation.class);
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new Service());
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		//number 속성값 얻기
		int number = printAnnotation.number();
		for(int i=0; i<number; i++) {
			//value 속성값 얻기
			String value = printAnnotation.value();
			System.out.println();
		}
		System.out.println();
	}
	
}
