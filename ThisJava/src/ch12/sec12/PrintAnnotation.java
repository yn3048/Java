package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 어노테이션 설정 정보 이용 p.558
 */

	
	@Target({ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface PrintAnnotation {
		String value() default "-";
		int number() default 15;	//value속성: 선의 종류   number 속성 : 출력 횟수
	}
	

