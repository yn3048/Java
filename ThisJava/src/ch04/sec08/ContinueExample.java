package ch04.sec08;


/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : continue문 p.137
 */

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {	//2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				continue;
			}
			System.out.print(i +" ");
		}
	}
	
}
