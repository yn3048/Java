package Test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/12/28
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x =sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y =  sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		
		System.out.println(result);
		
		sc.close();
		
		//조건이 참이면 x가 더 큽니다 출력 , 거짓이면 y가 더 큽니다 출력
	}
}
