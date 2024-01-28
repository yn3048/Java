package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

	//배열과 역순 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] numbers = new int[5];
		
		System.out.println("5개의 정수를 입력하세요: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		double avg = (double)sum / 5;
		System.out.println("입력한 정수의 합계: " + sum);
		System.out.println("입력한 정수의 평균: " + avg);
	}
		
}

