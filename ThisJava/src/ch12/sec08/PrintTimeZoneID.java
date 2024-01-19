package ch12.sec08;

import java.util.TimeZone;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 캘린더 클래스 p.537
 */


public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
	
}
