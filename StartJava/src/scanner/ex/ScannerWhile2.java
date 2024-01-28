package scanner.ex;

import java.util.Scanner;

public class ScannerWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
			String name = sc.nextLine();
			
			if(name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt(); // nextInt는 숫자만 가져가고 \n는 남겨둠
			sc.nextLine(); // 남아있는 \n 처리하기 위해 작성해준다
			
			System.out.print("입력한 이름 : " + name + ", 나이 : " + age);
			System.out.println();
			
		
		}
	}
	
}

