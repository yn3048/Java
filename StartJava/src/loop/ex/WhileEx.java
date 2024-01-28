package loop.ex;

public class WhileEx {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(count<10) {
			count += 1;
			System.out.println("현재 숫자는: " + count);
		}
		
		System.out.println("실행 종료..");
	}
}
