package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : Date 클래스 p.533
 */


public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm.ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
	
}
