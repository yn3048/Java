package ch05.sec04;
/*
 * 날짜 : 2024/01/16
 * 이름 : 이예나
 * 내용 : null과 NullPointerException
 * 
 */

public class NullPointExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		 intArray[0] = 10;  //NullPointerException
		 
		 String str = null;
		 System.out.println("총 문자 수: " + str.length()); //NullPointerException
	}
	
}
