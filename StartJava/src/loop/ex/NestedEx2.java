package loop.ex;

public class NestedEx2 {
	
	//중첩 for문을 사용해서 피라미드 만들기
	public static void main(String[] args) {
		int rows =10;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
