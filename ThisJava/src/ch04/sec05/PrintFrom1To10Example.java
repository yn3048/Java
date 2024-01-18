package ch04.sec05;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : while문 p.130
 */
public class PrintFrom1To10Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
			
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}
	
}
