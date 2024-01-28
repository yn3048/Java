package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

	//입력받을 숫자의 개수를 입력받도록 개선하자
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		int minNumber, maxNumber;
		
		System.out.println(n + "개의 정수를 입력하세요: ");
		for(int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		minNumber = maxNumber = numbers[0];
		for(int i = 1; i < n; i++) {
			if(numbers[i] < minNumber) {
				minNumber = numbers[i];
				
			}
			
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
				
			}
			
		}
		System.out.println("최소값: " + minNumber);
		System.out.println("최대값: " + maxNumber);
	}
		
}

