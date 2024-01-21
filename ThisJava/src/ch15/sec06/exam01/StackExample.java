package ch15.sec06.exam01;

import java.util.Stack;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : LIFO 와 FIFO컬렉션
 *  Stack은 후입선출이다. 따라서 마지막에 들어간 것이 제일 먼저 나온다.
 */
public class StackExample {

	public static void main(String[] args) {
		//Stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) {		//비어있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
