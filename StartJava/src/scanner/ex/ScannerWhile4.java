package scanner.ex;

import java.util.Scanner;

public class ScannerWhile4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCoast = 0;
		
		
		while(true) {
			System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
			int option = sc.nextInt();
			
			
			int sum = 0;
			
			
			if(option == 1) {
				sc.nextLine();
				
				System.out.print("상품명을 입력하세요 : ");
				String prodName = sc.nextLine();
				
				System.out.print("상품의 가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				System.out.println("구매 수량을 입력하세요 : ");
				int quantity = sc.nextInt();
				
				totalCoast += price * quantity;
				System.out.println("상품명:" + prodName + " 가격:" + price + 
								 " 수량:" + quantity + " 합계:" + price*quantity);
				
			} else if(option == 2) {
				System.out.println("총 비용 : " + totalCoast);
				totalCoast = 0;
				
			} else if(option == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("올바른 옵션을 선택해주세요.");
			}
		}
	
	}
	
}












