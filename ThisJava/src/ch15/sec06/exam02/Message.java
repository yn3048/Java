package ch15.sec06.exam02;


/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : LIFO 와 FIFO컬렉션
 * Queue는 선입선출 => 먼저 들어간것이 먼저 나온다.
 */
public class Message {

	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
		
	}
}
