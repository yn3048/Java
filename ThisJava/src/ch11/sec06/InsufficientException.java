package ch11.sec06;
/*
 * 날짜 : 2024/01/08
 * p.480 사용자 정의 예외
 * 
 */
public class InsufficientException extends Exception {

	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
