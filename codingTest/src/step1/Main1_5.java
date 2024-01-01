package step1;

import java.util.Scanner;

public class Main1_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a <=0 || b >= 10) return;
		
		double numA = (double)a;
		double numB = (double)b;
		
		System.out.println(numA / numB);
	}
}
