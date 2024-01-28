package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("음식 이름을 입력해주세요 : ");
		String foodName = sc.nextLine();
		
		System.out.print("음식의 가격을 입력해주세요 : ");
		int foodPrice = sc.nextInt();
		
		System.out.print("음식 수량을 입력해주세요 : ");
		int foodQuanitity = sc.nextInt();
		
		int totalPrice = foodPrice * foodQuanitity;
		
		System.out.println(foodName + " " + foodQuanitity + "개를 주문하셨습니다. 총 가격은 " 
													+ totalPrice + "원 입니다.");
		
	}
}
